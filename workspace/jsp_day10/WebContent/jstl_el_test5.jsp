<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL TEST(문자열 분할)</h2>
	<c:set var = "cnt" value = "0"></c:set>
	
	<c:forTokens var = "ani" items="horse,tiger,lion" delims = ",">
		<c:set var = "cnt" value="${cnt+1}"></c:set>
		동물 ${cnt}
		<%-- 동물${cnt=cnt+1} --%> : <c:out value="${ani}"></c:out><br>
		<!-- ${cnt+=1} : +=를 사용하면 문자열로 인식하여 연결할 수 있다 -->
	</c:forTokens>
</body>
</html>