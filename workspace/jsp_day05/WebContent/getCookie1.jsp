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
		String fruit ="";
		String cookie = request.getHeader("Cookie");
		if(cookie != null){
			Cookie[] cookies = request.getCookies();
			for(Cookie cook : cookies){
				if(cook.getName().equals("cookie")){
					fruit = cook.getValue();
				}
			}
		
	
	%>
	<h1><%=fruit%></h1>
	
	<%
			for(Cookie cook : cookies){
				if(cook.getName().equals("cookie")){
					Cookie new_cook = new Cookie("cookie", "banana");
					response.addCookie(new_cook);
				}
			}
		
		}
	%>
	<a href = "getCookie2.jsp">쿠키 변경확인</a>
</body>
</html>