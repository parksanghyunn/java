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
		String fruit = "";
		Cookie cookie = new Cookie("cookie", "apple");
		response.addCookie(cookie);
	%>
	<h1>쿠키 실습 예제</h1>
	<a href = "getCookie1.jsp">쿠키 전송</a>
</body>
</html>