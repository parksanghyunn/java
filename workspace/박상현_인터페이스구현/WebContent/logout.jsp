<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//로그아웃시 모든 세션을 삭제해 준다
	session.invalidate();

	//로그인 페이지로 바로 넘어간다
	response.sendRedirect("login.html");
%>
</body>
</html>