<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>GET방식 요청</h1>
	<%
		String city = request.getParameter("city");
		String zipcode = request.getParameter("zipcode");
		
		if(city == "" || zipcode == null){
			response.sendRedirect("response.jsp");
		}else{
	%>
	<!-- method 속성을 사용하지 않을 경우 default는 get방식 -->
	<form action = "request_response.jsp" method="get">
		<input type = "text" value = "Seoul" name = "city" readonly="readonly">
		<input type = "text" value = "06141" name = "zipcode" readonly="readonly">
		<button type = "submit">GET방식으로 요청보내기</button>
	</form>
	<p><%=city %><%=zipcode %></p>
	<%} %>
</body>
</html>