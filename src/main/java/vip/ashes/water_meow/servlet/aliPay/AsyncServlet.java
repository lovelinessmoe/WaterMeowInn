package vip.ashes.water_meow.servlet.aliPay;

import com.alipay.easysdk.factory.Factory;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
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
        //获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

//Async:params
//{gmt_create=2022-07-12 16:22:35, charset=UTF-8, gmt_payment=2022-07-12 16:22:54, notify_time=2022-07-12 16:22:55, subject=??wer, sign=EXyHnewHmlNu7h7HadqYMLgzkxWYP6e3ON89seYCSSTOXTlF1xpF70lc0iAHfAA+MJcBXz8kHSqibtI+9ywb204SWeQOURRBrHc4sIuTy3wPyPLazPho0rNL1lm7vYypzXgF3clPDQWrV7cXxUGA9K8fm+vJ6tTwT+7Iih9IzE9+J/0Zd9vVU7fDt0iOGTAbNhI4OblcJY+lfgbQVJU/vlu4ROfvKczHTldddDPottpgFQ2GeA4ueEIVGF+NkwDXONbWkoyG98CJyv9kQIY4thU+FzdBkyt5D8HA2kzXL+I+XtUuHqw7WtxEasiF6EggEtbCPmfFepICiGcNbKaKhg==, buyer_id=2088622957134283, invoice_amount=0.01, version=1.0, notify_id=2022071200222162254034280524845860, fund_bill_list=[{"amount":"0.01","fundChannel":"ALIPAYACCOUNT"}], notify_type=trade_status_sync, out_trade_no=fad481ae8d124763aa41aeb9cc6e841e, total_amount=0.01, trade_status=TRADE_SUCCESS, trade_no=2022071222001434280506682168, auth_app_id=2021000118645987, receipt_amount=0.01, point_amount=0.00, app_id=2021000118645987, buyer_pay_amount=0.01, sign_type=RSA2, seller_id=2088621957043634}
        System.out.println("Async:params");
        System.out.println(params);
        boolean signVerified = Factory.Payment.Common().verifyNotify(params);

        //——请在这里编写您的程序（以下代码仅作参考）——

        /* 实际验证过程建议商户务必添加以下校验：
        1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
        2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
        3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
        4、验证app_id是否为该商户本身。
        */
        if (signVerified) {//验证成功
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");

            if ("TRADE_FINISHED".equals(trade_status)) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            } else if ("TRADE_SUCCESS".equals(trade_status)) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
            }

            response.getWriter().println("success");

        } else {//验证失败
            response.getWriter().println("fail");

            //调试用，写文本函数记录程序运行情况是否正常
            //String sWord = AlipaySignature.getSignCheckContentV1(params);
            //AlipayConfig.logResult(sWord);
        }

        //——请在这里编写您的程序（以上代码仅作参考）——

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
