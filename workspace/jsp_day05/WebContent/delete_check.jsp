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
		String msg = "";
		String cookie = request.getHeader("Cookie");
		
		if(cookie == null){
			msg = "삭제가 완료 되었습니다.";
		}else{
			msg = "삭제가 되지 않았습니다";
			
		}
	%>
	<h2><%=msg %></h2>
</body>
</html>