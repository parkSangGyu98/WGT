/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-22 03:27:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addShop2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1656316243398L));
    _jspx_dependants.put("jar:file:/C:/wgt/Where-are-you-going-today/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wgt/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\" dir=\"ltr\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/initialize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/shopStyle.css\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no,  maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <title>가게 등록</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      <header id=\"header\"><h1>2/4</h1><h1>가게 등록</h1></header>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <div class=\"inner\">\r\n");
      out.write("          <form action=\"add_shop3\" method=\"post\" id=\"addForm\">\r\n");
      out.write("            <p>가게 영업 시간</p>\r\n");
      out.write("            <div class=\"hourBox\">\r\n");
      out.write("            <select class=\"select_box\" name=\"shop_hour1\">\r\n");
      out.write("            	<option value=\"01:00\">01:00</option>\r\n");
      out.write("            	<option value=\"02:00\">02:00</option>\r\n");
      out.write("            	<option value=\"03:00\">03:00</option>\r\n");
      out.write("            	<option value=\"04:00\">04:00</option>\r\n");
      out.write("            	<option value=\"05:00\">05:00</option>\r\n");
      out.write("            	<option value=\"06:00\">06:00</option>\r\n");
      out.write("            	<option value=\"07:00\">07:00</option>\r\n");
      out.write("            	<option value=\"08:00\">08:00</option>\r\n");
      out.write("            	<option value=\"09:00\">09:00</option>\r\n");
      out.write("            	<option value=\"10:00\">10:00</option>\r\n");
      out.write("            	<option value=\"11:00\">11:00</option>\r\n");
      out.write("            	<option value=\"12:00\">12:00</option>\r\n");
      out.write("            	<option value=\"13:00\">13:00</option>\r\n");
      out.write("            	<option value=\"14:00\">14:00</option>\r\n");
      out.write("            	<option value=\"15:00\">15:00</option>\r\n");
      out.write("            	<option value=\"16:00\">16:00</option>\r\n");
      out.write("            	<option value=\"17:00\">17:00</option>\r\n");
      out.write("            	<option value=\"18:00\">18:00</option>\r\n");
      out.write("            	<option value=\"19:00\">19:00</option>\r\n");
      out.write("            	<option value=\"20:00\">20:00</option>\r\n");
      out.write("            	<option value=\"21:00\">21:00</option>\r\n");
      out.write("            	<option value=\"22:00\">22:00</option>\r\n");
      out.write("            	<option value=\"23:00\">23:00</option>\r\n");
      out.write("            	<option value=\"24:00\">24:00</option>\r\n");
      out.write("            </select><span style=\"font-size:32px;\">~</span><select class=\"select_box\" name=\"shop_hour2\">\r\n");
      out.write("            	<option value=\"01:00\">01:00</option>\r\n");
      out.write("            	<option value=\"02:00\">02:00</option>\r\n");
      out.write("            	<option value=\"03:00\">03:00</option>\r\n");
      out.write("            	<option value=\"04:00\">04:00</option>\r\n");
      out.write("            	<option value=\"05:00\">05:00</option>\r\n");
      out.write("            	<option value=\"06:00\">06:00</option>\r\n");
      out.write("            	<option value=\"07:00\">07:00</option>\r\n");
      out.write("            	<option value=\"08:00\">08:00</option>\r\n");
      out.write("            	<option value=\"09:00\">09:00</option>\r\n");
      out.write("            	<option value=\"10:00\">10:00</option>\r\n");
      out.write("            	<option value=\"11:00\">11:00</option>\r\n");
      out.write("            	<option value=\"12:00\">12:00</option>\r\n");
      out.write("            	<option value=\"13:00\">13:00</option>\r\n");
      out.write("            	<option value=\"14:00\">14:00</option>\r\n");
      out.write("            	<option value=\"15:00\">15:00</option>\r\n");
      out.write("            	<option value=\"16:00\">16:00</option>\r\n");
      out.write("            	<option value=\"17:00\">17:00</option>\r\n");
      out.write("            	<option value=\"18:00\">18:00</option>\r\n");
      out.write("            	<option value=\"19:00\">19:00</option>\r\n");
      out.write("            	<option value=\"20:00\">20:00</option>\r\n");
      out.write("            	<option value=\"21:00\">21:00</option>\r\n");
      out.write("            	<option value=\"22:00\">22:00</option>\r\n");
      out.write("            	<option value=\"23:00\">23:00</option>\r\n");
      out.write("            	<option value=\"24:00\">24:00</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>가게 테이블 수</p>\r\n");
      out.write("            <select class=\"select_box\" name=\"shop_table\">\r\n");
      out.write("            	<option value=\"1\">1</option>\r\n");
      out.write("            	<option value=\"2\">2</option>\r\n");
      out.write("            	<option value=\"3\">3</option>\r\n");
      out.write("            	<option value=\"3\">3</option>\r\n");
      out.write("            	<option value=\"4\">4</option>\r\n");
      out.write("            	<option value=\"5\">5</option>\r\n");
      out.write("            	<option value=\"6\">6</option>\r\n");
      out.write("            	<option value=\"7\">7</option>\r\n");
      out.write("            	<option value=\"8\">8</option>\r\n");
      out.write("            	<option value=\"9\">9</option>\r\n");
      out.write("            	<option value=\"10\">10</option>\r\n");
      out.write("            	<option value=\"11\">11</option>\r\n");
      out.write("            	<option value=\"12\">12</option>\r\n");
      out.write("            	<option value=\"13\">13</option>\r\n");
      out.write("            	<option value=\"14\">14</option>\r\n");
      out.write("            	<option value=\"15\">15</option>\r\n");
      out.write("            	<option value=\"16\">16</option>\r\n");
      out.write("            	<option value=\"17\">17</option>\r\n");
      out.write("            	<option value=\"18\">18</option>\r\n");
      out.write("            	<option value=\"19\">19</option>\r\n");
      out.write("            	<option value=\"20\">20</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <p>테이블당 최대 수용 인원 수</p>\r\n");
      out.write("            <select class=\"select_box\" name=\"shop_max_people\">\r\n");
      out.write("            	<option value=\"1\">1</option>\r\n");
      out.write("            	<option value=\"2\">2</option>\r\n");
      out.write("            	<option value=\"3\">3</option>\r\n");
      out.write("            	<option value=\"4\">4</option>\r\n");
      out.write("            	<option value=\"5\">5</option>\r\n");
      out.write("            	<option value=\"6\">6</option>\r\n");
      out.write("            	<option value=\"7\">7</option>\r\n");
      out.write("            	<option value=\"8\">8</option>\r\n");
      out.write("            	<option value=\"9\">9</option>\r\n");
      out.write("            	<option value=\"10\">10</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <p>가게 전화번호</p>\r\n");
      out.write("            <div class=\"tel_box\">\r\n");
      out.write("            <select style=\"width: 100px;\" class=\"select_box\" name=\"shop_tel1\">\r\n");
      out.write("              <option value=\"02\">02 </option>\r\n");
      out.write("              <option value=\"031\">031 </option>\r\n");
      out.write("              <option value=\"032\">032 </option>\r\n");
      out.write("              <option value=\"033\">033 </option>\r\n");
      out.write("              <option value=\"041\">041 </option>\r\n");
      out.write("              <option value=\"042\">042 </option>\r\n");
      out.write("              <option value=\"043\">043 </option>\r\n");
      out.write("              <option value=\"051\">051 </option>\r\n");
      out.write("              <option value=\"052\">052 </option>\r\n");
      out.write("              <option value=\"053\">053 </option>\r\n");
      out.write("              <option value=\"054\">054 </option>\r\n");
      out.write("              <option value=\"055\">055 </option>\r\n");
      out.write("              <option value=\"061\">061 </option>\r\n");
      out.write("              <option value=\"062\">062 </option>\r\n");
      out.write("              <option value=\"063\">063 </option>\r\n");
      out.write("              <option value=\"064\">064 </option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <span style=\"font-size:32px;\">-</span>\r\n");
      out.write("            <input type=\"text\" name=\"shop_tel2\" class=\"input_box2\" maxlength=\"4\">\r\n");
      out.write("            <span style=\"font-size:32px;\">-</span>\r\n");
      out.write("            <input type=\"text\" name=\"shop_tel3\" class=\"input_box2\" maxlength=\"4\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"btn_wrap\">\r\n");
      out.write("              <input type=\"button\" value=\"취소하기\" onclick=\"location.href='map/map'\" class=\"prev_btn\">\r\n");
      out.write("              <input type=\"submit\" value=\"다음으로\" class=\"next_btn\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <footer id=\"footer\">Copyright (c) 2022 Copyright Holder All Rights Reserved.</footer>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
