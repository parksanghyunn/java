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
		String cookie_check = request.getHeader("Cookie");
		String id = "";
		if(cookie_check != null){
			Cookie [] cookies = request.getCookies();
			for(Cookie cook : cookies){
				if(cook.getName().equals("cookie")){
					id = cook.getValue();
					break;
				}
			}
		
	%>
	<h1><%=id %></h1>
	<%
		for(Cookie cook : cookies){
			cook.setMaxAge(0);
			response.addCookie(cook);
		}
	}
	%>
	<a href = "delete_check.jsp">삭제 여부 확인</a>
	
</body>
</html>