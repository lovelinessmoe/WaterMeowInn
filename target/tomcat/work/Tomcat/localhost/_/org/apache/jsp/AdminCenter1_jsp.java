/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-11 08:14:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminCenter1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>管理众筹</title>\n");
      out.write("    <style>\n");
      out.write("        *{margin:0px;padding:0px;}\n");
      out.write("        li{list-style:none;float:left;width:100px;height:50px;text-align:center;}\n");
      out.write("        * {\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-fluid {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: #3c4043;\n");
      out.write("            line-height: 50px\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .navbar-main a {\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part1 {\n");
      out.write("            background-color: #3c4043;\n");
      out.write("            float: left;\n");
      out.write("            height: 50px;\n");
      out.write("            width: 150px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part1:hover{\n");
      out.write("            background-color: #363432;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part2 {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 150px;\n");
      out.write("            float: left;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part2:hover{\n");
      out.write("            background-color: #363432;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part3 {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 150px;\n");
      out.write("            float: left;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-main_part3:hover{\n");
      out.write("            background-color: #363432;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main_left a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .clear {\n");
      out.write("            clear: both;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main_right {\n");
      out.write("            margin-right: 40px;\n");
      out.write("            width: 920px;\n");
      out.write("            border: 10px solid white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            float: right;\n");
      out.write("            margin-top: 35px;\n");
      out.write("            margin-bottom: 90px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 900px;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin: 10px 120px 30px 10px;\n");
      out.write("            line-height: 40px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {background-color: #f5f5f5;}\n");
      out.write("\n");
      out.write("        th{\n");
      out.write("            background-color: #3F3F3F;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            height: 30px;\n");
      out.write("            vertical-align: middle;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"AdminServlet\" method=\"post\">\n");
      out.write("    <div class=\"navbar-fluid\">\n");
      out.write("\n");
      out.write("        <div class=\"navbar-main\">\n");
      out.write("            <a href=\"AdminServlet?type=cfList\">\n");
      out.write("                <div class=\"navbar-main_part1\">众筹管理</div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"AdminServlet?type=userList\">\n");
      out.write("                <div class=\"navbar-main_part2\">用户管理</div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"AdminServlet?type=logout\">\n");
      out.write("                <div class=\"navbar-main_part3\">退出登录</div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <a class=\"clear\"></a>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <h1>欢迎，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("！</h1>\n");
      out.write("\n");
      out.write("        <div class=\"main_right\" style=\"background-color: white;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>项目编号</td>\n");
      out.write("                        <td>image</td>\n");
      out.write("                        <td>项目</td>\n");
      out.write("                        <td>描述</td>\n");
      out.write("                        <td>众筹金额</td>\n");
      out.write("                        <td>已筹金额</td>\n");
      out.write("                        <td>进度</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <a href=\"AdminServlet?type=editCF&id=0\">添加</a>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function deleteCF(id) {\n");
      out.write("            var r = confirm(\"确定要删除该方案吗？\");\n");
      out.write("            if (r === true) {\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"post\",\n");
      out.write("                    url: \"AdminServlet?type=deleteCF\",\n");
      out.write("                    data: {id:id},\n");
      out.write("                    dataType: \"json\",\n");
      out.write("                    success: function(data){\n");
      out.write("                        if(data.status===\"success\"){\n");
      out.write("                            alert(data.message);\n");
      out.write("                            window.location.href=\"AdminServlet?type=cfList\";\n");
      out.write("                        }else{\n");
      out.write("                            alert(data.message);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            } else {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
    // /AdminCenter1.jsp(151,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/AdminCenter1.jsp(151,20) '${cfList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cfList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /AdminCenter1.jsp(151,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.pic }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.exp }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.est }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.raised }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.pct }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("%</td>\n");
          out.write("                            <td><a href=\"AdminServlet?type=editCF&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">编辑</a></td>\n");
          out.write("                            <td><a href=\"javascript:deleteCF(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\">删除</a></td>\n");
          out.write("                        </tr>\n");
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
