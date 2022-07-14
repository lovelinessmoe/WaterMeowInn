package vip.ashes.water_meow.filter;

import vip.ashes.water_meow.bean.UserBean;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author loveliness
 */
@WebFilter("/AdminServlet")
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //查看用户是否是管理员
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("Login.jsp");
        } else {
            String type = user.getType();
            //是管理员
            if ("1".equals(type)) {
                chain.doFilter(req, resp);
            } else {
                request.getSession().invalidate();
                request.setAttribute("msg", "权限不够");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
    }


    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
