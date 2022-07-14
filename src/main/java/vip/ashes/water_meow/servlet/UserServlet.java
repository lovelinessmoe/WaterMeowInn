package vip.ashes.water_meow.servlet;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.service.HotelService;
import vip.ashes.water_meow.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String type = request.getParameter("type");
        UserService userService = new UserService();
        HotelService hotelService = new HotelService();

        if ("query".equals(type)) {
            ArrayList<Hotel> hotelList = hotelService.getHotelList();
            request.setAttribute("hotelList", hotelList);
            request.getRequestDispatcher("User/UserCenter.jsp").forward(request, response);
        } else if ("increase".equals(type)) {
            float value = Float.parseFloat(request.getParameter("value"));
            String id = request.getParameter("id");
            int rs = userService.raiseMoneyMount(id,value);
            System.out.println(value);
            HashMap<String, String> map = new HashMap<String, String>();
            //alert编码格式
            if (rs > 0) {
                map.put("status", "success");
                map.put("message", "捐赠成功！");
            } else {
                map.put("status", "error");
                map.put("message", "捐赠失败");
            }
//            JSONObject json = JSONObject.fromObject(map);
            response.getWriter().print(map);
        } else if ("logout".equals(type)) {
            request.getSession().invalidate();
            response.sendRedirect("Login.jsp");
        } else if ("register".equals(type)){
            String account = request.getParameter("account");
            String password = request.getParameter("password");
            String name = request.getParameter("name");
            String sex = request.getParameter("sex");
            String birth = request.getParameter("birth");
            String mob = request.getParameter("mob");

            int rs = userService.userAdd(account,password,name,sex,birth,mob);
            if (rs>0)
            {
                System.out.println("注册成功");
                response.sendRedirect("Entrance.jsp");
            }else {
                System.out.println("注册失败");
                response.sendRedirect("Register.jsp");
            }
        }
    }
}
