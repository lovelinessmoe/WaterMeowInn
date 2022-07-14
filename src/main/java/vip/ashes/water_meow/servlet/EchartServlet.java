package vip.ashes.water_meow.servlet;

import cn.hutool.json.JSONObject;
import vip.ashes.water_meow.service.EchartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EchartServlet", value = "/EchartServlet")
public class EchartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String type = request.getParameter("type");

        if ("userTypeList".equals(type)) {
            EchartService echartService = new EchartService();
            JSONObject userTypeList = EchartService.queryUserTypeList();
            System.out.println(userTypeList);
        }
    }
}
