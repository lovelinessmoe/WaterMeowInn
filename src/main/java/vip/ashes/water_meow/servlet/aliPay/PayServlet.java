package vip.ashes.water_meow.servlet.aliPay;

import cn.hutool.core.util.IdUtil;
import com.alipay.easysdk.factory.Factory.Payment;
import com.alipay.easysdk.payment.page.models.AlipayTradePagePayResponse;
import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.config.AlipayConfig;
import vip.ashes.water_meow.service.HotelService;
import vip.ashes.water_meow.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author loveliness
 * 支付订单，预定
 */
@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
    //    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HotelService hotelService = new HotelService();
        OrderService orderService = new OrderService();
        UserBean user = (UserBean) request.getSession().getAttribute("user");

        //获取房号，通过房号查询
        String roomNum = new String(request.getParameter("roomNum").getBytes("ISO-8859-1"), "UTF-8");
        Hotel hotelInfo = hotelService.getHotelByNum(roomNum);

        String subject = "水喵客栈房间:";
        subject += hotelInfo.getRoomNum();
        System.out.println(subject);

        String outTradeNo = IdUtil.simpleUUID();
        System.out.print("outTradeNo:");
        System.out.println(outTradeNo);

        String totalAmount = hotelInfo.getPrice() + "";
        System.out.println(totalAmount);

        //创建订单
        orderService.createOrder(hotelInfo.getRoomNum(),outTradeNo,totalAmount,user.getId());

        try {
            AlipayTradePagePayResponse pay = Payment.Page().pay(subject, outTradeNo, totalAmount, AlipayConfig.return_url);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print(pay.body);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


}
