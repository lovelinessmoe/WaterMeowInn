package vip.ashes.water_meow.servlet.aliPay;

import com.alipay.easysdk.factory.Factory;
import lombok.SneakyThrows;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 功能：支付宝服务器异步通知页面
 * 日期：2017-03-30
 * 说明：
 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 * ************************页面功能说明*************************
 * 创建该页面文件时，请留心该页面文件中无任何HTML代码及空格。
 * 该页面不能在本机电脑测试，请到服务器上做测试。请确保外部可以访问该页面。
 * 如果没有收到该页面返回的 success
 * 建议该页面只做支付成功的业务逻辑处理，退款的处理请以调用退款查询接口的结果为准。
 *
 * @author loveliness
 */
@WebServlet("/AsyncServlet")
public class AsyncServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderService orderService = new OrderService();

        Map<String, String> aliPayInfo = orderService.getAliPayInfo(request);

        System.out.println("Async:params");
        System.out.println(aliPayInfo);
        boolean signVerified = Factory.Payment.Common().verifyNotify(aliPayInfo);

        System.out.println("signVerified");
        System.out.println(signVerified);
        if (signVerified) {
            //商户订单号
            String outTradeNo = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
            //支付宝交易号
            String tradeNo = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            orderService.updateOrderFinsh(outTradeNo, tradeNo);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
