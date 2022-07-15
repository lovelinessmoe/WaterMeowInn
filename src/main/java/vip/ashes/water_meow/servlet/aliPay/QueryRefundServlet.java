package vip.ashes.water_meow.servlet.aliPay;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.payment.common.models.AlipayTradeFastpayRefundQueryResponse;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 查询退款，也没什么用
 * @author loveliness
 */
@WebServlet("/QueryRefundServlet")
public class QueryRefundServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = new String(request.getParameter("WIDRQout_trade_no").getBytes("ISO-8859-1"),"UTF-8");

        AlipayTradeFastpayRefundQueryResponse alipayTradeFastpayRefundQueryResponse = Factory.Payment.Common().queryRefund(out_trade_no, out_trade_no);
        //{
        //  "alipay_trade_fastpay_refund_query_response": {
        //    "code": "10000",
        //    "msg": "Success",
        //    "out_request_no": "267eba5dd0754a4bb80af0d96563dc52",
        //    "out_trade_no": "267eba5dd0754a4bb80af0d96563dc52",
        //    "refund_amount": "0.01",
        //    "refund_status": "REFUND_SUCCESS",
        //    "total_amount": "0.01",
        //    "trade_no": "2022071222001434280506682412"
        //  },
        //  "sign": "WHm5npEmsAsxtiQYv30ThGh6x4y3jnUwe/j0jeYppg2tTaEHY8gw8xWXIfU69AMFOud6fua9kZ8gn/2LjCg/aT6FbVoW/HnOUr5hDxhAuMkBCRVEFk02LUDkRGsLPybk1BxdQQoBYLcNHa5r4yAe8L6lHAKmpJklEk9TOY7ujpNqafYCxbPfDPhaxBPtNb5CEWNGsggWaKLQsqxXONROnh6vk3R1/thclbaKGoL9xQ6tv5mdGpvkEfXZNnt7414CqQMoTYF3Z8T/NB0iOtJhWunU1CLMktYkQp4xOHdcNhvwmjkprXg8kyeW7LRhZoyA/3yIfhZjgHxBaSRs9804aw\u003d\u003d"
        //}
        response.getWriter().println(alipayTradeFastpayRefundQueryResponse.msg);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
