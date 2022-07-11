package vip.ashes.water_meow.servlet;

import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.service.LoginService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String account = request.getParameter("account");
        String password = request.getParameter("password");

        LoginService LoginService = new LoginService();
        HttpSession session = request.getSession();

        UserBean userBean = LoginService.Login(account, password);

        if(account.equals(userBean.getAccount()) && password.equals(userBean.getPassword())) {
            session.setAttribute("user",userBean);
            System.out.println("登录成功");
            if (userBean.getType().equals("1")){
                response.sendRedirect("AdminServlet?type=cfList");
            }else if (userBean.getType().equals("2")){
                response.sendRedirect("UserServlet?type=query");
            }
        }else {
            response.sendRedirect("Login.jsp");
        }

    }
}
