package vip.ashes.water_meow.servlet;

import com.alipay.easysdk.payment.common.models.AlipayTradeRefundResponse;
import lombok.SneakyThrows;
import vip.ashes.water_meow.bean.Order;
import vip.ashes.water_meow.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author loveliness
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");

        OrderService orderService = new OrderService();
        switch (type) {
            case "unsubscribe":{
                String orderId = (String) request.getParameter("orderId");
                Order order = orderService.getOrderByID(orderId);
                //预订了（支付了），没有入住或者退款
                if ("1".equals(order.getState())) {
                    AlipayTradeRefundResponse alipayTradeRefundResponse = orderService.refundOrder(order);
                    if ("Success".equals(alipayTradeRefundResponse.getMsg())) {
                        request.setAttribute("hotel_order_msg", "该订单已退款");
                    }else {
                        request.setAttribute("hotel_order_msg", "订单可能已经退款");
                    }
                } else {
                    request.setAttribute("hotel_order_msg", "该订单未支付或已完成");
                }
                request.getRequestDispatcher("AdminServlet?type=listAllOrder").forward(request, response);
                break;
            } case "finishorder":{
                String orderId = (String) request.getParameter("orderId");
                Order order = orderService.getOrderByID(orderId);
                if ("1".equals(order.getState())){
                    orderService.finishOrder(order);
                    request.getRequestDispatcher("AdminServlet?type=listAllOrder").forward(request, response);
                }else {
                    request.setAttribute("hotel_order_msg", "无效");
                }

                break;
            }
            default:
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
