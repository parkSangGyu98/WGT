<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>알림</title>
</head>
<body>
	<script type="text/javascript">
		var message = "${msg}";
		var returnUrl = "${url}";
		alert(message);
		document.location.href = returnUrl;
	</script>
</body>
</html>