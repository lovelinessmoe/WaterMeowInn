package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.Order;
import vip.ashes.water_meow.dao.OrderDao;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author loveliness
 */
public class OrderService {
    OrderDao orderDao = new OrderDao();

    /**
     * {gmt_create=2022-07-12 16:22:35, charset=UTF-8, gmt_payment=2022-07-12 16:22:54, notify_time=2022-07-12 16:22:55, subject=??wer, sign=EXyHnewHmlNu7h7HadqYMLgzkxWYP6e3ON89seYCSSTOXTlF1xpF70lc0iAHfAA+MJcBXz8kHSqibtI+9ywb204SWeQOURRBrHc4sIuTy3wPyPLazPho0rNL1lm7vYypzXgF3clPDQWrV7cXxUGA9K8fm+vJ6tTwT+7Iih9IzE9+J/0Zd9vVU7fDt0iOGTAbNhI4OblcJY+lfgbQVJU/vlu4ROfvKczHTldddDPottpgFQ2GeA4ueEIVGF+NkwDXONbWkoyG98CJyv9kQIY4thU+FzdBkyt5D8HA2kzXL+I+XtUuHqw7WtxEasiF6EggEtbCPmfFepICiGcNbKaKhg==, buyer_id=2088622957134283, invoice_amount=0.01, version=1.0, notify_id=2022071200222162254034280524845860, fund_bill_list=[{"amount":"0.01","fundChannel":"ALIPAYACCOUNT"}], notify_type=trade_status_sync, out_trade_no=fad481ae8d124763aa41aeb9cc6e841e, total_amount=0.01, trade_status=TRADE_SUCCESS, trade_no=2022071222001434280506682168, auth_app_id=2021000118645987, receipt_amount=0.01, point_amount=0.00, app_id=2021000118645987, buyer_pay_amount=0.01, sign_type=RSA2, seller_id=2088621957043634}
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    public Map<String, String> getAliPayInfo(HttpServletRequest request) throws UnsupportedEncodingException {
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
        return params;
    }

    public Order getOrderByID(String outTradeNo) {
        return orderDao.getOrderByID(outTradeNo);
    }

    public void updateOrderFinsh(String outTradeNo, String tradeNo) {
        orderDao.updateOrderFinish(outTradeNo,tradeNo);
    }

    public void createOrder(String subject, String outTradeNo, String totalAmount, int id) {
        orderDao.createOrder(subject,outTradeNo,totalAmount,id);
    }
}
