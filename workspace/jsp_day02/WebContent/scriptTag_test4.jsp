<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 3행 5열 -->
	<table border = "1">
	<%
		for(int i = 0; i<3; i++){
	%>
		<tr>
			<%
				for(int j = 0; j<5; j++){
			
			%>
			<td><%= i+1%>행 <%=j+1%>열</td>
			<%}%>
		</tr>
	<%}%>
	</table>
</body>
</html>