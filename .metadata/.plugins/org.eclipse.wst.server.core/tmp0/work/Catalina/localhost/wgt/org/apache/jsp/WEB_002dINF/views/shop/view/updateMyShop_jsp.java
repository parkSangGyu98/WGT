/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-23 08:14:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.shop.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateMyShop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/initialize.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/shopStyle.css\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no,  maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("<title>가게 메뉴 정보 수정</title>\r\n");
      out.write("</head>\r\n");
      out.write("  <body style=\"background: #DA0037;\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      <h1 style=\"font-size: 52px; margin-top: 40px; margin-bottom: 20px; color:white; text-align: center;\">가게 정보 수정</h1>\r\n");
      out.write("      <p style=\"font-size: 22px; color:white;\">사업자 번호와 가게이름은<br>현재 변경 불가능합니다.</p>\r\n");
      out.write("      <div style=\"width: 90%; height: 100%; background: white; margin-top: 30px; padding: 20px; box-shadow: 0 15px black; border-radius: 30px;\">\r\n");
      out.write("      <form method=\"post\" action=\"updateShop\" class=\"flexForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">가게 사업자 번호</span>\r\n");
      out.write("        <input name=\"businessNumber\" type=\"text\" class=\"text readonlyinput\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.businessNumber }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"color: gray\"/>\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">가게 이름</span>\r\n");
      out.write("	    <input name=\"shopName\" type=\"text\" class=\"text readonlyinput\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"color: gray\"/>\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">가게 번호</span>\r\n");
      out.write("      	<div id=tel onclick=\"changeTel(); this.onclick='';\">\r\n");
      out.write("      	<input class=\"text input_box2Full tel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopTel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"shopTel\" readonly/>\r\n");
      out.write("      	</div>\r\n");
      out.write("      	<input type=\"button\" onclick=\"sample6_execDaumPostcode()\" class=\"next_btn\" value=\"우편번호 찾기\"><br>\r\n");
      out.write("		<input type=\"text\" name=\"shop_address1\" id=\"sample6_postcode\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopPostCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"우편번호\">\r\n");
      out.write("		<input type=\"text\" name=\"shop_address2\" id=\"sample6_address\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopAddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"주소\">\r\n");
      out.write("		<input type=\"text\" name=\"shop_address3\" id=\"sample6_detailAddress\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopDetailAddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"상세주소\">\r\n");
      out.write("		<input type=\"text\" name=\"shop_address4\" id=\"sample6_extraAddress\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopExtraAddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"참고항목\">\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">영업 시간</span>\r\n");
      out.write("      	<div id=\"hours\" onclick=\"changeHours(); this.onclick='';\">\r\n");
      out.write("      	<input name=\"shopHours\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopHours }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("      	</div>\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">가게 테이블 보유 수</span>\r\n");
      out.write("      <div id=\"tables\" onclick=\"changeTables(); this.onclick='';\">\r\n");
      out.write("      	<input name=\"shop_tables\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopTables }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">가게 테이블당 최대 수용 인원 수</span>\r\n");
      out.write("      <div id=\"maxTables\" onclick=\"changeMaxTables(); this.onclick='';\">\r\n");
      out.write("      	<input name=\"shop_max_people\" class=\"text input_box2Full\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopMaxPeoples }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <span class=\"text\" style=\"color: #DA0037;\">수정 전 가게 사진</span>\r\n");
      out.write("      	<img src=\"../resources/shop/shop_Img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopImg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".jpg\" style=\"border-radius: 30px;\" />\r\n");
      out.write("      	<input name=\"shopImg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.shopImg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none;\">\r\n");
      out.write("            <p style=\"text-align:center; font-size: 22px; margin-top: 15px;\">수정 할 사진을 업로드 해주세요!<br>전의 사진을 그대로 사용하고싶다면<br>사진 업로드를 하지 않으셔도 됩니다.</p>\r\n");
      out.write("            <div class=\"file_upload_wrap\">\r\n");
      out.write("              <label for=\"upload_file\" class=\"upload_label\">사진 등록</label>\r\n");
      out.write("              <input id=\"upload_file\" type=\"file\" name=\"shop_img\" onchange=\"readURL(this)\" accept=\"image/jpeg, image/png, image/jpg\">\r\n");
      out.write("              <br>\r\n");
      out.write("              <span style=\"margin-bottom: 15px; font-size: 28px;\">미리보기</span>\r\n");
      out.write("              <img style=\"width: 380px; height: 400px;\" id=\"preview\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("      	<input type=\"submit\" class=\"next_btn\" style=\"width: 80%; margin: 30px 0 25px; border: 5px solid white; border-radius: 30px; box-shadow: 0 10px black;\" value=\"수정 완료\">\r\n");
      out.write("      	</form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"button\" name=\"button\" class=\"prev_btn\" style=\" width: 80%; margin: 30px 0 25px; border: 5px solid white; border-radius: 30px; box-shadow: 0 10px black;\" onclick=\"location.href='viewMyShop'\">뒤로 돌아가기</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("      function changeTel() {\r\n");
      out.write("		document.querySelector(\"#tel\").innerHTML = \r\n");
      out.write("        '<div class=\"tel_box\">' +\r\n");
      out.write("        '<select style=\"width: 55px;\" class=\"select_box\" name=\"shop_tel1\">' +\r\n");
      out.write("        '<option value=\"02\">02 </option>' +\r\n");
      out.write("        '<option value=\"031\">031 </option>' +\r\n");
      out.write("        '<option value=\"032\">032 </option>' +\r\n");
      out.write("        '<option value=\"033\">033 </option>' +\r\n");
      out.write("        '<option value=\"041\">041 </option>' +\r\n");
      out.write("        '<option value=\"042\">042 </option>' +\r\n");
      out.write("        '<option value=\"043\">043 </option>' +\r\n");
      out.write("        '<option value=\"051\">051 </option>' +\r\n");
      out.write("        '<option value=\"052\">052 </option>' +\r\n");
      out.write("        '<option value=\"053\">053 </option>' +\r\n");
      out.write("        '<option value=\"054\">054 </option>' +\r\n");
      out.write("        '<option value=\"055\">055 </option>' +\r\n");
      out.write("        '<option value=\"061\">061 </option>' +\r\n");
      out.write("        '<option value=\"062\">062 </option>' +\r\n");
      out.write("        '<option value=\"063\">063 </option>' +\r\n");
      out.write("        '<option value=\"064\">064 </option>' +\r\n");
      out.write("        '</select>' +\r\n");
      out.write("        '<span style=\"font-size:32px;\">-</span>' +\r\n");
      out.write("        '<input type=\"text\" name=\"shop_tel2\" class=\"input_box2\" maxlength=\"4\" style=\"width:100px;\" oninput=\"autoNum(this); autoString(this)\">' +\r\n");
      out.write("        '<span style=\"font-size:32px;\">-</span>' +\r\n");
      out.write("        '<input type=\"text\" name=\"shop_tel3\" class=\"input_box2\" maxlength=\"4\" style=\"width:100px;\" oninput=\"autoNum(this); autoString(this)\">' +\r\n");
      out.write("        '</div>';\r\n");
      out.write("	}\r\n");
      out.write("      \r\n");
      out.write("    function changeHours() {\r\n");
      out.write("    	document.querySelector(\"#hours\").innerHTML =\r\n");
      out.write("	    	'<div class=\"hourBox\">' +\r\n");
      out.write("	    	'<select class=\"select_box\" name=\"shop_hour1\">' +\r\n");
      out.write("	    	'<option value=\"01:00\">01:00</option>' +\r\n");
      out.write("	    	'<option value=\"02:00\">02:00</option>' +\r\n");
      out.write("	    	'<option value=\"03:00\">03:00</option>' +\r\n");
      out.write("	    	'<option value=\"04:00\">04:00</option>' +\r\n");
      out.write("	    	'<option value=\"05:00\">05:00</option>' +\r\n");
      out.write("	    	'<option value=\"06:00\">06:00</option>' +\r\n");
      out.write("	    	'<option value=\"07:00\">07:00</option>' +\r\n");
      out.write("	    	'<option value=\"08:00\">08:00</option>' +\r\n");
      out.write("	    	'<option value=\"09:00\">09:00</option>' +\r\n");
      out.write("	    	'<option value=\"10:00\">10:00</option>' +\r\n");
      out.write("	    	'<option value=\"11:00\">11:00</option>' +\r\n");
      out.write("	    	'<option value=\"12:00\">12:00</option>' +\r\n");
      out.write("	    	'<option value=\"13:00\">13:00</option>' +\r\n");
      out.write("	    	'<option value=\"14:00\">14:00</option>' +\r\n");
      out.write("	    	'<option value=\"15:00\">15:00</option>' +\r\n");
      out.write("	    	'<option value=\"16:00\">16:00</option>' +\r\n");
      out.write("	    	'<option value=\"17:00\">17:00</option>' +\r\n");
      out.write("	    	'<option value=\"18:00\">18:00</option>' +\r\n");
      out.write("	    	'<option value=\"19:00\">19:00</option>' +\r\n");
      out.write("	    	'<option value=\"20:00\">20:00</option>' +\r\n");
      out.write("	    	'<option value=\"21:00\">21:00</option>' +\r\n");
      out.write("	    	'<option value=\"22:00\">22:00</option>' +\r\n");
      out.write("	    	'<option value=\"23:00\">23:00</option>' +\r\n");
      out.write("	    	'<option value=\"24:00\">24:00</option>' +\r\n");
      out.write("	    	'</select><span style=\"font-size:32px;\">~</span><select class=\"select_box\" name=\"shop_hour2\">' +\r\n");
      out.write("	    	'<option value=\"01:00\">01:00</option>' +\r\n");
      out.write("	    	'<option value=\"02:00\">02:00</option>' +\r\n");
      out.write("	    	'<option value=\"03:00\">03:00</option>' +\r\n");
      out.write("	    	'<option value=\"04:00\">04:00</option>' +\r\n");
      out.write("	    	'<option value=\"05:00\">05:00</option>' +\r\n");
      out.write("	    	'<option value=\"06:00\">06:00</option>' +\r\n");
      out.write("	    	'<option value=\"07:00\">07:00</option>' +\r\n");
      out.write("	    	'<option value=\"08:00\">08:00</option>' +\r\n");
      out.write("	    	'<option value=\"09:00\">09:00</option>' +\r\n");
      out.write("	    	'<option value=\"10:00\">10:00</option>' +\r\n");
      out.write("	    	'<option value=\"11:00\">11:00</option>' +\r\n");
      out.write("	    	'<option value=\"12:00\">12:00</option>' +\r\n");
      out.write("	    	'<option value=\"13:00\">13:00</option>' +\r\n");
      out.write("	    	'<option value=\"14:00\">14:00</option>' +\r\n");
      out.write("	    	'<option value=\"15:00\">15:00</option>' +\r\n");
      out.write("	    	'<option value=\"16:00\">16:00</option>' +\r\n");
      out.write("	    	'<option value=\"17:00\">17:00</option>' +\r\n");
      out.write("	    	'<option value=\"18:00\">18:00</option>' +\r\n");
      out.write("	    	'<option value=\"19:00\">19:00</option>' +\r\n");
      out.write("	    	'<option value=\"20:00\">20:00</option>' +\r\n");
      out.write("	    	'<option value=\"21:00\">21:00</option>' +\r\n");
      out.write("	    	'<option value=\"22:00\">22:00</option>' +\r\n");
      out.write("	    	'<option value=\"23:00\">23:00</option>' +\r\n");
      out.write("	    	'<option value=\"24:00\">24:00</option>' +\r\n");
      out.write("	    	'</select>' +\r\n");
      out.write("	    	'</div>';\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function changeTables() {\r\n");
      out.write("		document.querySelector(\"#tables\").innerHTML =\r\n");
      out.write("			'<select class=\"select_box\" name=\"shop_table\">' +\r\n");
      out.write("	    	'<option value=\"1\">1</option>' +\r\n");
      out.write("	    	'<option value=\"2\">2</option>' +\r\n");
      out.write("	    	'<option value=\"3\">3</option>' +\r\n");
      out.write("	    	'<option value=\"3\">3</option>' +\r\n");
      out.write("	    	'<option value=\"4\">4</option>' +\r\n");
      out.write("	    	'<option value=\"5\">5</option>' +\r\n");
      out.write("	    	'<option value=\"6\">6</option>' +\r\n");
      out.write("	    	'<option value=\"7\">7</option>' +\r\n");
      out.write("	    	'<option value=\"8\">8</option>' +\r\n");
      out.write("	    	'<option value=\"9\">9</option>' +\r\n");
      out.write("	    	'<option value=\"10\">10</option>' +\r\n");
      out.write("	    	'<option value=\"11\">11</option>' +\r\n");
      out.write("	    	'<option value=\"12\">12</option>' +\r\n");
      out.write("	    	'<option value=\"13\">13</option>' +\r\n");
      out.write("	    	'<option value=\"14\">14</option>' +\r\n");
      out.write("	    	'<option value=\"15\">15</option>' +\r\n");
      out.write("	    	'<option value=\"16\">16</option>' +\r\n");
      out.write("	    	'<option value=\"17\">17</option>' +\r\n");
      out.write("	    	'<option value=\"18\">18</option>' +\r\n");
      out.write("	    	'<option value=\"19\">19</option>' +\r\n");
      out.write("	    	'<option value=\"20\">20</option>' +\r\n");
      out.write("	    	'</select>';\r\n");
      out.write("	}\r\n");
      out.write("    \r\n");
      out.write("    function changeMaxTables() {\r\n");
      out.write("		document.querySelector(\"#maxTables\").innerHTML =\r\n");
      out.write("            '<select class=\"select_box\" name=\"shop_max_people\">' +\r\n");
      out.write("		    	'<option value=\"1\">1</option>' + \r\n");
      out.write("		    	'<option value=\"2\">2</option>' +\r\n");
      out.write("		    	'<option value=\"3\">3</option>' +\r\n");
      out.write("		    	'<option value=\"4\">4</option>' +\r\n");
      out.write("		    	'<option value=\"5\">5</option>' +\r\n");
      out.write("		    	'<option value=\"6\">6</option>' +\r\n");
      out.write("		    	'<option value=\"7\">7</option>' +\r\n");
      out.write("		    	'<option value=\"8\">8</option>' +\r\n");
      out.write("		    	'<option value=\"9\">9</option>' +\r\n");
      out.write("		    	'<option value=\"10\">10</option>' +\r\n");
      out.write("		    '</select>';\r\n");
      out.write("	}\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("	function readURL(input) {\r\n");
      out.write("		const type = input.files[0].name.split('.');\r\n");
      out.write("		if(type[1] != \"jpg\" && type[1] != \"png\" &&  type[1] != \"jpeg\"){\r\n");
      out.write("			alert(\"이미지 파일은 (jpg, png, jpeg) 형식만 등록 가능합니다.\");\r\n");
      out.write("			document.getElementById('preview').src = \"\";\r\n");
      out.write("			document.getElementById('img').value = null;\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		  if (input.files && input.files[0]) {\r\n");
      out.write("		    var reader = new FileReader();\r\n");
      out.write("		    reader.onload = function(e) {\r\n");
      out.write("		      document.getElementById('preview').src = e.target.result;\r\n");
      out.write("		    };\r\n");
      out.write("		    reader.readAsDataURL(input.files[0]);\r\n");
      out.write("		  } else {\r\n");
      out.write("		    document.getElementById('preview').src = \"\";\r\n");
      out.write("		  }\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("    function sample6_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var addr = ''; // 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("                \r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById('sample6_postcode').value = data.zonecode;\r\n");
      out.write("                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("        \r\n");
      out.write("        const autoString = (target) => {\r\n");
      out.write("      	  target.value = target.value\r\n");
      out.write("      	   .replace( /[\\{\\}\\[\\]\\/?.,;:|\\)*~`!^\\-_+┼<>@#$%&\\'\\\"\\\\\\(\\=]/g, '');\r\n");
      out.write("      	  }\r\n");
      out.write("      const autoNum = (target) => {\r\n");
      out.write("      	  target.value = target.value\r\n");
      out.write("      	   .replace(/[^0-9]/g, '');\r\n");
      out.write("      	  }\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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