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
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String account = request.getParameter("account");
        String password = request.getParameter("password");

        LoginService loginService = new LoginService();

        UserBean userBean = loginService.Login(account, password);

        if (account.equals(userBean.getAccount()) && password.equals(userBean.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("user", userBean);
            if ("1".equals(userBean.getType())) {
                response.sendRedirect("AdminServlet?type=cfList");
            } else if ("2".equals(userBean.getType())) {
                response.sendRedirect("UserServlet?type=query");
            }
        } else {
            response.sendRedirect("Login.jsp");
        }

    }
}
