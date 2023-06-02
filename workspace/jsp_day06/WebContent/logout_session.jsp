<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
	//원하는 세션만 삭제
	//session.removeAttribute("user_id");
	//담고있는 모든 세션 삭제
	session.invalidate();
%>
<script>
	location.href = "login_session.jsp";
</script>
</body>
</html>