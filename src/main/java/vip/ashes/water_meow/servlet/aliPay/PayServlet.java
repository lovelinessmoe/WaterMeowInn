package vip.ashes.water_meow.servlet.aliPay;

import cn.hutool.core.util.IdUtil;
import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.factory.Factory.Payment;
import com.alipay.easysdk.payment.page.models.AlipayTradePagePayResponse;
import vip.ashes.water_meow.config.AlipayConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author loveliness
 */
@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
    //    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取房号，通过房号查询
        String subject = request.getParameter("subject");
        System.out.print("subject:");
        System.out.println(subject);
//        String subject = "subject";
        String outTradeNo = IdUtil.simpleUUID();
        System.out.print("outTradeNo:");
        System.out.println(outTradeNo);
        String totalAmount = request.getParameter("total_amount");
        System.out.print("totalAmount:");
        System.out.println(totalAmount);
//        String totalAmount = "100";
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
