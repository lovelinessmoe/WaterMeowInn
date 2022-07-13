package vip.ashes.water_meow.servlet.aliPay;

import com.alipay.easysdk.factory.Factory;
import lombok.SneakyThrows;
import vip.ashes.water_meow.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author loveliness
 */
@WebServlet("/SuccedServlet")
public class SuccedServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("支付成功");

        OrderService orderService = new OrderService();
        Map<String, String> aliPayInfo = orderService.getAliPayInfo(request);

        boolean signVerified = Factory.Payment.Common().verifyNotify(aliPayInfo);

        System.out.println("Success:params");
        System.out.println(aliPayInfo);
        if (signVerified) {
            //商户订单号
            String outTradeNo = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //支付宝交易号
            String tradeNo = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //付款金额
            String totalAmount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("trade_no:" + tradeNo + "<br/>out_trade_no:" + outTradeNo + "<br/>total_amount:" + totalAmount);
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("验签失败");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
