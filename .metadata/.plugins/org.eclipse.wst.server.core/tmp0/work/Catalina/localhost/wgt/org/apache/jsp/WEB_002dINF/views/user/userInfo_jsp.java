/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-29 02:21:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.text.*;
import java.util.*;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/wgt/Where-are-you-going-today/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wgt/WEB-INF/lib/spring-webmvc-5.3.21.jar!/META-INF/spring-form.tld", Long.valueOf(1655248556000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.21.jar", Long.valueOf(1658298198011L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1656316243398L));
    _jspx_dependants.put("jar:file:/C:/wgt/Where-are-you-going-today/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wgt/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/wgt/Where-are-you-going-today/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wgt/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/user/modify.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.15.4/css/all.css\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no,  maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("<title>회원정보 보기</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"userInfo\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("		");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("		<button type=\"submit\" class=\"sBtn\" onclick=\"location.href='modifyUser';\" style=\"margin-top: 10px; margin-bottom: 10px; background: gray;\">수정하기</button>\r\n");
      out.write("		<button type=\"submit\" class=\"sBtn\" onclick=\"location.href='map/map';\">뒤로가기</button>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("	<!-- 스크립트 영역 -->\r\n");
      out.write("	<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		// input 태그 (name이 file)를 가져옴 \r\n");
      out.write("		let fileTag = document.querySelector(\"input[name=file]\");\r\n");
      out.write("		\r\n");
      out.write("		// 파일태그에 변화가 있을 때 실행될 함수 작성 \r\n");
      out.write("		fileTag.onchange = function () {\r\n");
      out.write("			\r\n");
      out.write("			let imgTag = document.querySelector(\"#profileImg\");\r\n");
      out.write("			\r\n");
      out.write("			// 파일이 있는지 확인\r\n");
      out.write("			if(fileTag.files.length > 0) {\r\n");
      out.write("				// 파일을 선택한 경우 미리보기 생성 (이미지 태그 src에 데이터를 넣어주면 됨)\r\n");
      out.write("				let reader = new FileReader();\r\n");
      out.write("				\r\n");
      out.write("				// reader 읽어들이는 작업(onload)를 끝냈을 때 함수 실행, 읽어온 데이터를 함수의 파라미터로 줄 수 있음\r\n");
      out.write("				reader.onload = function (data) {\r\n");
      out.write("					console.log(data);\r\n");
      out.write("					imgTag.src = data.target.result;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				reader.readAsDataURL(fileTag.files[0]);\r\n");
      out.write("			} else {\r\n");
      out.write("				// 취소 버튼 누를 경우\r\n");
      out.write("				imgTag.src = \"\";\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		   function sample6_execDaumPostcode() {\r\n");
      out.write("		        new daum.Postcode({	\r\n");
      out.write("		            oncomplete: function(data) {\r\n");
      out.write("		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("		                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("		                var addr = ''; // 주소 변수\r\n");
      out.write("		                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("		                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("		                    addr = data.roadAddress;\r\n");
      out.write("		                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("		                    addr = data.jibunAddress;\r\n");
      out.write("		                }\r\n");
      out.write("\r\n");
      out.write("		                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("		                if(data.userSelectedType === 'R'){\r\n");
      out.write("		                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("		                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("		                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("		                        extraAddr += data.bname;\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("		                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("		                    if(extraAddr !== ''){\r\n");
      out.write("		                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("		                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("		                \r\n");
      out.write("		                } else {\r\n");
      out.write("		                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("		                }\r\n");
      out.write("\r\n");
      out.write("		                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("		                document.getElementById('sample6_postcode').value = data.zonecode;\r\n");
      out.write("		                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("		                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("		                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("		            }\r\n");
      out.write("		        }).open();\r\n");
      out.write("		    }\r\n");
      out.write("\r\n");
      out.write("	</script> \r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/user/userInfo.jsp(21,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("user");
      // /WEB-INF/views/user/userInfo.jsp(21,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/user/userInfo.jsp(21,2) '${userList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${userList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("		<div style=\"font-size: 100px;text-align: center;background: #DA0037;color: white;\">회원정보</div>\r\n");
            out.write("		<!-- required는 입력을 안할시 자동으로 입력하라고 알림창을 띄움 -->\r\n");
            out.write("		<div style=\"text-align: center; padding-top: 20px; font-size: 30px;\">아이디 \r\n");
            out.write("		<input type=\"text\" name=\"userId\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" readonly \r\n");
            out.write("		style=\"text-align: center; height: 25px;\"></div><br> \r\n");
            out.write("		\r\n");
            out.write("		<div style=\"margin-left: 95px; padding-top: 20px; font-size: 30px;\">이름 \r\n");
            out.write("		<input type=\"text\" name=\"name\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" required readonly\r\n");
            out.write("		style=\"text-align: center; height: 25px;\"></div><br>\r\n");
            out.write("		\r\n");
            out.write("		<div style=\"margin-left: 47px; padding-top: 20px; font-size: 30px;\">전화번호 \r\n");
            out.write("		<input type=\"text\" name=\"phone\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" required readonly\r\n");
            out.write("		style=\" text-align: center; height: 25px;\"></div><br>\r\n");
            out.write("		\r\n");
            out.write("		<div style=\"text-align: center; padding-bottom: 10px; font-size: 30px;\">주소</div>\r\n");
            out.write("        <div><input type=\"text\" name=\"addr1\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.addr1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"sample6_postcode\" placeholder=\"우편번호\" style=\"margin-left: 55px;width: 280px; height: 25px; text-align: center;\" readonly></div><br>\r\n");
            out.write("        <div><input type=\"text\" name=\"addr2\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.addr2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"sample6_address\" placeholder=\"주소\" style=\"margin-left: 55px;width: 280px; height: 25px; text-align: center;\" readonly></div><br>\r\n");
            out.write("        <div><input type=\"text\" name=\"addr3\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.addr3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"sample6_detailAddress\" placeholder=\"상세주소\" style=\"margin-left: 55px;width: 280px; height: 25px; text-align: center;\" readonly></div><br>\r\n");
            out.write("        <input type=\"text\" name=\"addr4\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.addr4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"sample6_extraAddress\" placeholder=\"참고항목\" style=\"margin-left: 55px;width: 280px; height: 25px; text-align: center;\" readonly>\r\n");
            out.write("		\r\n");
            out.write("		<div style=\"text-align: center; font-size: 30px; padding-top: 10px;\">프로필 사진<br>\r\n");
            out.write("		<img src=\"resources/user/img/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.imgName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(".jpg\" id=\"profileImg\" name=\"imgName\" style=\"width: 100px; height: 100px;\" /><br></div>  \r\n");
            out.write("		\r\n");
            out.write("		");
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
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
