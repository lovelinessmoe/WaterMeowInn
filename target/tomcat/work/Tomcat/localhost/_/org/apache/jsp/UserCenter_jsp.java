/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-12 01:42:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserCenter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>UserCenter</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            padding: 0px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-fluid {\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            background-color: #3c4043;\r\n");
      out.write("            line-height: 50px\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .navbar-main a {\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .main_left a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .clear {\r\n");
      out.write("            clear: both;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .main_right {\r\n");
      out.write("            margin-right: 40px;\r\n");
      out.write("            width: 920px;\r\n");
      out.write("            border: 10px solid white;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin-top: 35px;\r\n");
      out.write("            margin-bottom: 90px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table {\r\n");
      out.write("            width: 900px;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            margin: 10px 120px 30px 10px;\r\n");
      out.write("            line-height: 40px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:hover {\r\n");
      out.write("            background-color: #f5f5f5;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #3F3F3F;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td {\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar-fluid {\r\n");
      out.write("            color: whitesmoke;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"UserServlet\" method=\"post\">\r\n");
      out.write("    <div class=\"navbar-fluid\">\r\n");
      out.write("        <h1>欢迎，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("！</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <a class=\"clear\"></a>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main_right\" style=\"background-color: white;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>门牌号</td>\r\n");
      out.write("                        <td>价格</td>\r\n");
      out.write("                        <td>房间类型</td>\r\n");
      out.write("                        <td>房间状态</td>\r\n");
      out.write("                        <td>众筹金额</td>\r\n");
      out.write("                        <td>已筹金额</td>\r\n");
      out.write("                        <td>进度</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                <br>\r\n");
      out.write("                <a href=\"UserServlet?type=logout\">退出登录</a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function fundMoney3(id) {\r\n");
      out.write("        var r = confirm(\"要向该项目捐赠￥100吗？\");\r\n");
      out.write("        if (r === true) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                url: \"UserServlet?type=increase&value=100\",\r\n");
      out.write("                data: {id: id},\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if (data.status === \"success\") {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                        window.location.href = \"UserServlet?type=query\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function fundMoney2(id) {\r\n");
      out.write("        var r = confirm(\"要向该项目捐赠￥50吗？\");\r\n");
      out.write("        if (r === true) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                url: \"UserServlet?type=increase&value=50\",\r\n");
      out.write("                data: {id: id},\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if (data.status === \"success\") {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                        window.location.href = \"UserServlet?type=query\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function fundMoney1(id) {\r\n");
      out.write("        var r = confirm(\"要向该项目捐赠￥10吗？\");\r\n");
      out.write("        if (r === true) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                url: \"UserServlet?type=increase&value=10\",\r\n");
      out.write("                data: {id: id},\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if (data.status === \"success\") {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                        window.location.href = \"UserServlet?type=query\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(data.message);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /UserCenter.jsp(114,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/UserCenter.jsp(114,20) '${hotelList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${hotelList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /UserCenter.jsp(114,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.roomNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.type }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.state }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <div class=\"button\"><a href=\"javascript:fundMoney1(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.roomNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\">捐赠￥10</a></div>\r\n");
          out.write("                            </td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <div class=\"button\"><a href=\"javascript:fundMoney2(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.roomNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\">捐赠￥50</a></div>\r\n");
          out.write("                            </td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <div class=\"button\"><a href=\"javascript:fundMoney3(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.roomNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\">捐赠￥100</a></div>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
