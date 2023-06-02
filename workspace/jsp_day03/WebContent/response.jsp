<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST</title>
</head>
<body>
	<h1>PSOT방식의 요청</h1>
	<form action="request_response.jsp" method="post">
		<input type = "text" value = "Seoul" name = "city" readonly="readonly">
		<input type = "text" value = "06141" name = "zipcode" readonly="readonly">
		<button type = "submit">GET방식으로 요청 보내기</button>
	</form>
</body>
</html>