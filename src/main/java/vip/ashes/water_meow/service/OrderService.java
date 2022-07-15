package vip.ashes.water_meow.service;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.payment.common.models.AlipayTradeRefundResponse;
import vip.ashes.water_meow.bean.Order;
import vip.ashes.water_meow.dao.HotelDao;
import vip.ashes.water_meow.dao.OrderDao;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author loveliness
 */
public class OrderService {
    OrderDao orderDao = new OrderDao();
    HotelDao hotelDao = new HotelDao();

    /**
     * {charset=UTF-8, out_trade_no=594b11c74e624c4094c8a098a490a3a1, method=alipay.trade.page.pay.return, total_amount=5.00, trade_no=2022071322001434280506683177, auth_app_id=2021000118645987, version=1.0, app_id=2021000118645987, seller_id=2088621957043634, timestamp=2022-07-13 16:42:31}
     *
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    public Map<String, String> getAliPayInfo(HttpServletRequest request) throws UnsupportedEncodingException {
        Map<String, String> res = new HashMap<>();
        Enumeration<?> temp = request.getParameterNames();
        while (temp.hasMoreElements()) {
            String en = (String) temp.nextElement();
            String value = request.getParameter(en);
            res.put(en, value);
        }
        return res;
    }

    public Order getOrderByID(String outTradeNo) {
        return orderDao.getOrderByID(outTradeNo);
    }

    public void updateOrderFinsh(String outTradeNo, String tradeNo) {
        Order orderByID = getOrderByID(outTradeNo);
        hotelDao.updateHotleState("1", orderByID.getRoomNum());
        orderDao.updateOrderFinish(outTradeNo, tradeNo);
    }

    public void createOrder(String subject, String outTradeNo, String totalAmount, int id) {
        orderDao.createOrder(subject, outTradeNo, totalAmount, id);
    }

    public ArrayList<Order> listAllOrder() {
        return orderDao.listAllOrder();
    }

    /**
     * 退款订单
     *
     * @param order 订单
     * @return
     */
    public AlipayTradeRefundResponse refundOrder(Order order) throws Exception {
        hotelDao.updateHotleState("0", order.getRoomNum());
        String refunded = "3";
        orderDao.updateOrderState(refunded,order.getOrderId());

        //商户订单号，商户网站订单系统中唯一订单号
        String outTradeNo = order.getOrderId();
        //需要退款的金额，该金额不能大于订单金额，必填
        String refundAmount = order.getPrice() + "";
        return Factory.Payment.Common().refund(outTradeNo, refundAmount);
    }

    public void finishOrder(Order order) {
        hotelDao.updateHotleState("0", order.getRoomNum());
        orderDao.updateOrderState("2",order.getOrderId());


    }
}
