<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
	사용자에게 이름을 입력 받고 확인 버튼을 눌렀을때
	admin일 경우 "관리자",member일 경우 일반 회원 입력한 이름,그외에는 "비회원"을 출력
	* 다른 페이지 없이 현재 페이지에서 처리하고, 결과가 출력될때에는 input태그와 submit버튼이 나오게 해서는 안된다(결과만)
	  form태그의 속성인 action을 생략하면 새로고침이 된다(현재 페이지로 이동)
	  el과 jstl만 사용
 -->
<body>
	<c:choose>
		<c:when test="${empty param.id}">
			<form>
				<input type="text" name="id"> 
				<button type = "submit" name = "btn">확인</button>
			</form>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${param.id eq 'admin' }">관리자</c:when>
				<c:when test="${param.id eq 'member' }">
					일반회원 : ${param.id}
					일반회원 : <c:out value = "${param.id}"/>
				</c:when>
				<c:otherwise>비회원</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>

</body>
</html>