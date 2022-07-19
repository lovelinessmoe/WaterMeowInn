package vip.ashes.water_meow.servlet;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.bean.Order;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.service.AdminService;
import vip.ashes.water_meow.service.HotelService;
import vip.ashes.water_meow.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author loveliness
 */
@WebServlet(name = "AdminServlet", urlPatterns = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        AdminService adminService = new AdminService();
        OrderService orderService = new OrderService();
        HotelService hotelService = new HotelService();

        switch (type) {
                case "hotelList": {
                    ArrayList<Hotel> hotels = adminService.queryHotelList();
                    request.setAttribute("hotels", hotels);
                    request.getRequestDispatcher("Admin/HotelManger.jsp").forward(request, response);
                    break;
                }
            case "userList": {
                ArrayList<UserBean> ubList = adminService.queryUserList();
                request.setAttribute("ubList", ubList);
                request.getRequestDispatcher("Admin/UserManger.jsp").forward(request, response);
                break;
            }
            case "logout": {
                request.getSession().invalidate();
                response.sendRedirect("Login.jsp");
                break;
            }
            /*case "editCF": {
                String id = request.getParameter("id");
                CFBean cfBean = editCFProject.getCFMsg(id);
                if (cfBean == null) {
                    cfBean = new CFBean();
                    cfBean.setId(0);
                }
                request.setAttribute("editingCFBean", cfBean);
                request.getRequestDispatcher("hotelEdit.jsp").forward(request, response);
                break;
            }*/
            case "editCFHandle": {
                String roomNum = request.getParameter("roomNum");
                String pic = request.getParameter("pic");
                String name = request.getParameter("name");
                String exp = request.getParameter("exp");
                String est = request.getParameter("est");
                String raised = request.getParameter("raised");
                String pct = request.getParameter("pct");
                System.out.println(roomNum);
                if (Integer.parseInt(roomNum) > 0) {
                    int rs = adminService.updateCF(roomNum, pic, name, exp, est, raised, pct);
                    if (rs > 0) {
                        response.sendRedirect("AdminServlet?type=hotelList");
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败");
                    }
                } else {
                    int rs = adminService.insertCF(pic, name, exp, est, raised, pct);
                    if (rs > 0) {
                        response.sendRedirect("AdminServlet?type=hotelList");
                        System.out.println("添加成功");
                    } else {
                        System.out.println("添加失败");
                    }
                }
                break;
            }

            //管理员添加房子
            case "addHotelInfo": {
                String roomNum = request.getParameter("roomNum");
                Double p = Double.parseDouble(request.getParameter("price"));
                BigDecimal price = BigDecimal.valueOf(p);
                String type1 = request.getParameter("type1");
                String state = request.getParameter("state");

                System.out.println(roomNum + price + type1 + state);

                HashMap<String, String> map = new HashMap<>();
                if (adminService.addHotelInfo(roomNum, price, type1, state) > 0) {
//                    response.sendRedirect("HotelManger.jsp");
                    response.sendRedirect("AdminServlet?type=hotelList");

                    map.put("status", "success");
                    map.put("message", "添加成功");
                } else {
                    map.put("status", "error");
                    map.put("message", "添加失败");
                }
                response.getWriter().print(map);
                break;
            }

            case "queryByRoomNum": {
                String roomNum = new String(request.getParameter("roomNum").getBytes("ISO-8859-1"), "UTF-8");
//                String roomNum = request.getParameter("roomNum");
                Hotel hotel = null;
                hotel = adminService.queryByRoomNum(roomNum);
                if(hotel!=null){
                    request.setAttribute("hotel",hotel);
                    request.getRequestDispatcher("Admin/hotelEdit.jsp").forward(request,response);
                }
                break;
            }

            //管理员编辑房子
            case "editHotelInfo": {
                String roomNum = request.getParameter("roomNum");
//                System.out.println(roomNum);
                String price = request.getParameter("price");
                String type1 = request.getParameter("type1");
                String state = request.getParameter("state");

                if (adminService.queryByRoomNum(roomNum)!=null) {
                    //修改
                    if (adminService.editHotelInfo(roomNum, price, type1, state)) {
                        response.sendRedirect("AdminServlet?type=hotelList");
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败！");
                    }
                } else {
                    //添加
                    System.out.println("数据获取失败！");
                    HashMap<String, String> map = new HashMap<>();
                    Double p = Double.parseDouble(price);
                    BigDecimal price1 = BigDecimal.valueOf(p);
                    if (adminService.addHotelInfo(roomNum, price1, type1, state) > 0) {
//                    response.sendRedirect("HotelManger.jsp");
                        response.sendRedirect("AdminServlet?type=hotelList");

                        map.put("status", "success");
                        map.put("message", "添加成功");
                    } else {
                        map.put("status", "error");
                        map.put("message", "添加失败");
                    }
                    response.getWriter().print(map);
                }
                break;
            }

            case "delHotel": {
                String roomNum = request.getParameter("roomNum");
                System.out.println(roomNum);
                int rs = adminService.delHotel(roomNum);
                HashMap<String, String> map = new HashMap<>();
                if (rs > 0) {
                    map.put("status", "success");
                    map.put("message", "删除成功");
                    response.sendRedirect("AdminServlet?type=hotelList");
                } else {
                    map.put("status", "error");
                    map.put("message", "删除失败");
                }
//                JSONObject json = JSONObject.fromObject(map);
                response.getWriter().print(map);
                break;
            }



            //管理用户


            case "editUser": {
                String id = request.getParameter("id");
                UserBean userBean = adminService.getUserMsg(id);
                if (userBean == null) {
                    userBean = new UserBean();
                    userBean.setId(0);
                }
                request.setAttribute("editingUserBean", userBean);
                request.getRequestDispatcher("Admin/userEdit.jsp").forward(request, response);
                break;
            }
            case "editUserHandle": {
                String id = request.getParameter("id");
                String account = request.getParameter("account");
                String password = request.getParameter("password");
                String name = request.getParameter("name");
                String sex = request.getParameter("sex");
                String birth = request.getParameter("birth");
                String mob = request.getParameter("mob");
                String type1 = request.getParameter("type1");
                System.out.println(id);
                if (Integer.parseInt(id) > 0) {
                    int rs = adminService.updateUser(id, account, password, name, sex, birth, mob, type1);
                    if (rs > 0) {
                        response.sendRedirect("AdminServlet?type=userList");
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败");
                    }
                } else {
                    int rs = adminService.insertUser(account, password, name, sex, birth, mob, type1);
                    if (rs > 0) {
                        response.sendRedirect("AdminServlet?type=userList");
                        System.out.println("添加成功");
                    } else {
                        System.out.println("添加失败");
                    }
                }
                break;
            }
            case "deleteUser": {
                int id = Integer.parseInt(request.getParameter("id"));
                System.out.println("id");
                int rs = adminService.deleteUser(id);
                HashMap<String, String> map = new HashMap<>();
                if (rs > 0) {
                    map.put("status", "success");
                    map.put("message", "删除成功");
                } else {
                    map.put("status", "error");
                    map.put("message", "删除失败");
                }
//                JSONObject json = JSONObject.fromObject(map);
                response.getWriter().print(map);
                break;
            }
            case "listAllOrder": {

                ArrayList<Order> odlt = orderService.listAllOrder();
                request.setAttribute("odlt", odlt);
                request.getRequestDispatcher("Admin/OrderManger.jsp").forward(request, response);
                break;
            }
            case "live": {
                String orderId = request.getParameter("orderId");
                Order order = orderService.getOrderByID(orderId);
                if ("0".equals(order.getState())) {
                    request.setAttribute("hotel_order_msg", "该订单未支付");
                    request.getRequestDispatcher("AdminServlet?type=listAllOrder").forward(request, response);
                } else if ("1".equals(order.getState())){
                    hotelService.updateHotleState("2",order.getRoomNum());
                    response.sendRedirect("AdminServlet?type=listAllOrder");
                }else if ("2".equals(order.getState())){
                    request.setAttribute("hotel_order_msg", "该订单已完成");
                    request.getRequestDispatcher("AdminServlet?type=listAllOrder").forward(request, response);
                }else if ("3".equals(order.getState())){
                    request.setAttribute("hotel_order_msg", "该订单已退款");
                    request.getRequestDispatcher("AdminServlet?type=listAllOrder").forward(request, response);
                }
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
