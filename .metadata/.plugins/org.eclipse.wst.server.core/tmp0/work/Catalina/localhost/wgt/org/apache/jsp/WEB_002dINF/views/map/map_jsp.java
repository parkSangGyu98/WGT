/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-08-18 07:20:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.net.URLEncoder;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1.0, user-scalable=no, \r\n");
      out.write("  maximum-scale=1.0, minimum-scale=1.0\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<script>\r\n");
      out.write("		function submit_form() {\r\n");
      out.write("			document.getElementById('submitID').submit();\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("	<!--검색어 입력에 맞는 주소로 이동.-->\r\n");
      out.write("	<input id=\"inputaddr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none;\"/>\r\n");
      out.write("	<nav id=gnb>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li class=\"sub1\"><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님, 반가워요 !</span></li>\r\n");
      out.write("			<li class=\"sub2\">\r\n");
      out.write("				<form id=\"submitID\" action=\"go_get_waiting\" method=\"post\">\r\n");
      out.write("					<a onclick=\"submit_form()\">나의 웨이팅</a>\r\n");
      out.write("				</form>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"sub3\">\r\n");
      out.write("					<a onclick=\"location.href='/wgt/userInfo';\">회원정보 보기</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<form class=\"header_form\" action=\"map\" method=\"post\">\r\n");
      out.write("	<ul class=headerMenu>\r\n");
      out.write("	<li><a class=\"back\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"><img\r\n");
      out.write("		src=\"../resources/mapcss/img/backicon.png\"></a></li>	\r\n");
      out.write("		<li><select class=\"selectbox\">\r\n");
      out.write("			<option>주소</option>\r\n");
      out.write("			<option>메뉴</option>\r\n");
      out.write("		</select> </li>\r\n");
      out.write("		<!--검색어 입력창-->\r\n");
      out.write("		<li><input onkeyup=\"filter()\" id=\"inputSearch\" class=\"inputtext\"\r\n");
      out.write("			type=\"text\" name=\"name\" value=\"\" required></li>\r\n");
      out.write("		<li><a class=\"userInformation\"> <span></span></a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("		");

		// 스크립트 반복문 사용을 위한 count 선언
		int count = 0;
		
      out.write("\r\n");
      out.write("		<div id=\"map\" onclick=\"filter()\" style=\"width: 370px; height: 790px; margin-left: 10px;\"></div>\r\n");
      out.write("		<script type=\"text/javascript\"\r\n");
      out.write("			src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=5b341178fe09d0d9b1f0550b3aa199be&libraries=services\"></script>\r\n");
      out.write("		<div class=\"map_wrap\">\r\n");
      out.write("			<div id=\"menu_wrap\" class=\"bg_white\">\r\n");
      out.write("				<hr>\r\n");
      out.write("				<ul id=\"placesList\">\r\n");
      out.write("				<!--모든 가게이름을 다 불러와 맵에 마크와 컨테츠 표현-->\r\n");
      out.write("					");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /WEB-INF/views/map/map.jsp(66,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("shop");
        // /WEB-INF/views/map/map.jsp(66,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/map/map.jsp(66,5) '${find}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${find}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /WEB-INF/views/map/map.jsp(66,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVarStatus("status");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("						<div class=\"item\" style=\"display: none;\">\r\n");
              out.write("							<input id=\"findname");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("								onclick=\"inputText\"\r\n");
              out.write("								style=\"display:none;\" />\r\n");
              out.write("								 <span class=\"name\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</span> \r\n");
              out.write("						</div>\r\n");
              out.write("						");

						// 스크립트 반복문 사용을 위한 카운트 증가
						count++;
						
              out.write("\r\n");
              out.write("					");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("					<!--위도와 경도를 불러와 등록되어 있는 가게 위치 표시-->\r\n");
      out.write("					");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--검색창 엔터키 서브밋을 위한 버튼-->\r\n");
      out.write("		<button value=\"검색\" style=\"display:none\"></button>\r\n");
      out.write("		<!--id값을 이용하여 스크립트에 반복문 사용을 위한 카운트 등록-->\r\n");
      out.write("		<input id=\"count\" value=\"");
      out.print(count);
      out.write("\"\r\n");
      out.write("			style=\"display:none;\"/>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			const count = document.getElementById(\"count\").value\r\n");
      out.write("			const toggleBtn = document.querySelector(\".userInformation\")\r\n");
      out.write("			const gnbBtn = document.querySelector(\"#gnb\")\r\n");
      out.write("			const bodytoggle = document.querySelector(\".header_form\")\r\n");
      out.write("			const searchbtn = document.querySelector(\".searchbtn\")\r\n");
      out.write("			\r\n");
      out.write("			const filterClose = document.querySelector(\"#menu_wrap\")\r\n");
      out.write("			var mapClick = document.getElementById('map')\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			function toggleHandler() {\r\n");
      out.write("				toggleBtn.classList.toggle(\"open\")\r\n");
      out.write("				gnbBtn.classList.toggle(\"on\")\r\n");
      out.write("				bodytoggle.classList.toggle(\"on\")\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write(" 			function filterEvent() {\r\n");
      out.write("				filterClose.style.opacity = \"0\";\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			mapClick.addEventListener(\"click\", filterEvent); \r\n");
      out.write("			\r\n");
      out.write("			toggleBtn.addEventListener(\"click\", toggleHandler);\r\n");
      out.write("				\r\n");
      out.write("			function filter() {\r\n");
      out.write("						\r\n");
      out.write("				var value, name, item, i, background;\r\n");
      out.write("				value = document.getElementById(\"inputSearch\").value\r\n");
      out.write("						.toUpperCase();\r\n");
      out.write("				item = document.getElementsByClassName(\"item\");\r\n");
      out.write("				background = document.getElementById(\"menu_wrap\")\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				for (i = 0; i < item.length; i++) {\r\n");
      out.write("					name = item[i].getElementsByClassName(\"name\")\r\n");
      out.write("					\r\n");
      out.write("					if (name[0].innerHTML.toUpperCase().indexOf(value) > -1) {\r\n");
      out.write("						item[i].style.display = \"flex\";\r\n");
      out.write("						background.style.opacity = \"100\";\r\n");
      out.write("						background.style.left = \"0\";\r\n");
      out.write("					}else{\r\n");
      out.write("						item[i].style.display = \"none\";\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					if (value.length == 0) {\r\n");
      out.write("						item[i].style.display = \"none\";\r\n");
      out.write("						background.style.opacity = \"0\";\r\n");
      out.write("						background.style.left = \"-270px\";\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			var MARKER_WIDTH = 24, // 기본, 클릭 마커의 너비\r\n");
      out.write("			MARKER_HEIGHT = 35, // 기본, 클릭 마커의 높이\r\n");
      out.write("			OFFSET_X = 12, // 기본, 클릭 마커의 기준 X좌표\r\n");
      out.write("			OFFSET_Y = MARKER_HEIGHT, // 기본, 클릭 마커의 기준 Y좌표\r\n");
      out.write("			OVER_MARKER_WIDTH = 31, // 오버 마커의 너비\r\n");
      out.write("			OVER_MARKER_HEIGHT = 41, // 오버 마커의 높이\r\n");
      out.write("			OVER_OFFSET_X = 13, // 오버 마커의 기준 X좌표\r\n");
      out.write("			OVER_OFFSET_Y = OVER_MARKER_HEIGHT, // 오버 마커의 기준 Y좌표\r\n");
      out.write("			CLICK_MARKER_WIDTH = 17, CLICK_MARKER_HEIGHT = 29;\r\n");
      out.write("\r\n");
      out.write("			var imageSrc = \"https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png\";\r\n");
      out.write("			// 마커 이미지를 생성합니다    \r\n");
      out.write("			var markerSize = new kakao.maps.Size(MARKER_WIDTH, MARKER_HEIGHT), // 기본, 클릭 마커의 크기\r\n");
      out.write("			markerOffset = new kakao.maps.Point(OFFSET_X, OFFSET_Y), // 기본, 클릭 마커의 기준좌표\r\n");
      out.write("			overMarkerSize = new kakao.maps.Size(OVER_MARKER_WIDTH,\r\n");
      out.write("					OVER_MARKER_HEIGHT), // 오버 마커의 크기\r\n");
      out.write("			overMarkerOffset = new kakao.maps.Point(OVER_OFFSET_X,\r\n");
      out.write("					OVER_OFFSET_Y), // 오버 마커의 기준 좌표\r\n");
      out.write("			clickMarkerSize = new kakao.maps.Size(CLICK_MARKER_WIDTH,\r\n");
      out.write("					CLICK_MARKER_HEIGHT);\r\n");
      out.write("\r\n");
      out.write("			selectedMarker = null; // 클릭한 마커를 담을 변수\r\n");
      out.write("			selectedContent = null;\r\n");
      out.write("\r\n");
      out.write("			var mapContainer = document.getElementById('map'), // 지도를 표시할 div\r\n");
      out.write("			mapOption = {\r\n");
      out.write("				center : new kakao.maps.LatLng(35.865491251524496,\r\n");
      out.write("						128.5934081998044), // 지도의 중심좌표\r\n");
      out.write("				level : 3\r\n");
      out.write("			// 지도의 확대 레벨\r\n");
      out.write("			};\r\n");
      out.write("\r\n");
      out.write("			var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\r\n");
      out.write("			var positions = []//좌표값을 받을 배열\r\n");
      out.write("			var content = [] //가게 이름을 받을 배열\r\n");
      out.write("			var inputText = []\r\n");
      out.write("			// 지도 위에 마커를 표시합니다\r\n");
      out.write("			for (var i = 0, len = count; i < len; i++) {\r\n");
      out.write("				var gapX = (MARKER_WIDTH), // 스프라이트 이미지에서 마커로 사용할 이미지 X좌표 간격 값\r\n");
      out.write("				originY = (MARKER_HEIGHT) * i, // 스프라이트 이미지에서 기본, 클릭 마커로 사용할 Y좌표 값\r\n");
      out.write("				overOriginY = (OVER_MARKER_HEIGHT) * i, // 스프라이트 이미지에서 오버 마커로 사용할 Y좌표 값\r\n");
      out.write("				normalOrigin = new kakao.maps.Point(0, originY), // 스프라이트 이미지에서 기본 마커로 사용할 영역의 좌상단 좌표\r\n");
      out.write("				clickOrigin = new kakao.maps.Point(gapX, originY), // 스프라이트 이미지에서 마우스오버 마커로 사용할 영역의 좌상단 좌표\r\n");
      out.write("				overOrigin = new kakao.maps.Point(gapX * 2, overOriginY); // 스프라이트 이미지에서 클릭 마커로 사용할 영역의 좌상단 좌표\r\n");
      out.write("\r\n");
      out.write("				positions.push(new kakao.maps.LatLng(document\r\n");
      out.write("						.getElementById(\"longitude\" + i).value, document\r\n");
      out.write("						.getElementById(\"latitude\" + i).value)); //좌표값을 받아와 배열에 추가하여 마커를 표시\r\n");
      out.write("\r\n");
      out.write("				content.push('<div class=\"wrap\"><div class=\"info\"><div class=\"title\">'\r\n");
      out.write("								+ document.getElementById(\"findname\" + i).value\r\n");
      out.write("								+ '</div></div></div>');//가게이름을 받아와 배열에 추가\r\n");
      out.write("								\r\n");
      out.write("				inputText.push(document.getElementById(\"findname\" + i).value)\r\n");
      out.write("			\r\n");
      out.write("				// 마커를 생성하고 지도위에 표시합니다\r\n");
      out.write("				addMarker(positions[i], inputText[i], content[i], normalOrigin, overOrigin, clickOrigin);\r\n");
      out.write("			}\r\n");
      out.write("			// 마커를 생성하고 지도 위에 표시하고, 마커에 mouseover, mouseout, click 이벤트를 등록하는 함수입니다\r\n");
      out.write("			function addMarker(position, inputText, content, normalOrigin, overOrigin, clickOrigin) {\r\n");
      out.write("				\r\n");
      out.write("				var markerImage = new kakao.maps.MarkerImage(\r\n");
      out.write("						imageSrc, markerSize), \r\n");
      out.write("					overMarker = new kakao.maps.MarkerImage(\r\n");
      out.write("						imageSrc, overMarkerSize), \r\n");
      out.write("					clickMarker = new kakao.maps.MarkerImage(\r\n");
      out.write("						imageSrc, clickMarkerSize);\r\n");
      out.write("				\r\n");
      out.write("			       // 마커를 생성하고 이미지는 기본 마커 이미지를 사용합니다\r\n");
      out.write("			       var marker = new kakao.maps.Marker({\r\n");
      out.write("			           map: map,\r\n");
      out.write("			           position: position,\r\n");
      out.write("			           image: markerImage \r\n");
      out.write("			       });\r\n");
      out.write("			       \r\n");
      out.write("			       var overlay = new kakao.maps.CustomOverlay({\r\n");
      out.write("			          content: content,\r\n");
      out.write("			          map: map,\r\n");
      out.write("			          position: position\r\n");
      out.write("			       });\r\n");
      out.write("			       	       \r\n");
      out.write("			       marker.markerImage = markerImage;\r\n");
      out.write("				// 마커에 click 이벤트를 등록합니다\r\n");
      out.write("				overlay.setMap(null);\r\n");
      out.write("				kakao.maps.event.addListener(marker, 'click', function() {\r\n");
      out.write("					// 클릭된 마커가 없고, click 마커가 클릭된 마커가 아니면\r\n");
      out.write("					// 마커의 이미지를 클릭 이미지로 변경합니다\r\n");
      out.write("						for(var i = 0, len = document.getElementById(\"count\").value; i < len; i++){\r\n");
      out.write("			       			document.getElementById(\"inputSearch\").value = inputText\r\n");
      out.write("							\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("					if (!selectedMarker || selectedMarker !== marker) {\r\n");
      out.write("						// 클릭된 마커 객체가 null이 아니면\r\n");
      out.write("						// 클릭된 마커의 이미지를 기본 이미지로 변경하고\r\n");
      out.write("						!!selectedMarker\r\n");
      out.write("								&& selectedMarker\r\n");
      out.write("										.setImage(selectedMarker.markerImage);\r\n");
      out.write("						!!selectedContent && selectedContent.setMap(null);	\r\n");
      out.write("					}\r\n");
      out.write("					console.log(1)\r\n");
      out.write("					filter()\r\n");
      out.write("					console.log(2)\r\n");
      out.write("\r\n");
      out.write("					// 현재 클릭된 마커의 이미지는 클릭 이미지로 변경, 컨테츠를 띄워줌\r\n");
      out.write("					if (marker.markerImage != clickMarker) {\r\n");
      out.write("						marker.setImage(clickMarker)\r\n");
      out.write("						overlay.setMap(map)\r\n");
      out.write("						\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					// 클릭된 마커를 현재 클릭된 마커 객체로 설정합니다\r\n");
      out.write("					selectedMarker = marker;\r\n");
      out.write("					selectedContent = overlay;\r\n");
      out.write("					\r\n");
      out.write("				});\r\n");
      out.write("\r\n");
      out.write("				kakao.maps.event.addListener(map, 'click', function() {\r\n");
      out.write("					if (!overlay.setMap(null)) {\r\n");
      out.write("						overlay.setMap(null);\r\n");
      out.write("						marker.setImage(markerImage)\r\n");
      out.write("					}\r\n");
      out.write("				})\r\n");
      out.write("			}\r\n");
      out.write("			var geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("			geocoder.addressSearch(document.getElementById(\"inputaddr\").value,\r\n");
      out.write("					function(result, status) {\r\n");
      out.write("\r\n");
      out.write("						// 정상적으로 검색이 완료됐으면 \r\n");
      out.write("						if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\r\n");
      out.write("							var coords = new kakao.maps.LatLng(result[0].y,\r\n");
      out.write("									result[0].x);\r\n");
      out.write("\r\n");
      out.write("							// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다\r\n");
      out.write("							map.setCenter(coords);\r\n");
      out.write("						}\r\n");
      out.write("					});\r\n");
      out.write("		</script>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/map/map.jsp(14,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/mapcss/map.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/map/map.jsp(43,27) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/login");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/map/map.jsp(79,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("shop");
      // /WEB-INF/views/map/map.jsp(79,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/map/map.jsp(79,5) '${find}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${find}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/map/map.jsp(79,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("								 <input id=\"longitude");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.longitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("								style=\"display:none;\" /> \r\n");
            out.write("								<input id=\"latitude");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shop.latitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("								style=\"display:none;\" />\r\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
