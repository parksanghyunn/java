<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controller.jsp">
		보고싶은 페이지 선택 :
		<select name = "site">
			<option value = "naver">네이버</option>
			<option value = "daum">다음</option>
			<option value = "google">구글</option>
		</select>
		<input type = "submit" value = "전송">
	</form>
</body>
</html>