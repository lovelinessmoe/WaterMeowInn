package vip.ashes.water_meow.filter;

import com.alipay.easysdk.factory.Factory;
import vip.ashes.water_meow.config.AlipayConfig;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author loveliness
 */
@WebFilter("/*")
public class AllFilter implements Filter {
    public static boolean initFlag = false;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (!initFlag) {
            // 设置参数（全局只需设置一次）
            Factory.setOptions(AlipayConfig.getOptions());
        }

        //转换
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        System.out.println("filter");
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
