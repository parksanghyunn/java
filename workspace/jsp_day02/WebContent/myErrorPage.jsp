<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오류</title>
</head>
<body>
	<h1>오류가 발생했어요 다시 해보세요</h1>
	<%
		out.print(exception);
	%>
</body>
</html>