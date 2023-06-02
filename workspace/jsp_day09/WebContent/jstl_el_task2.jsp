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
<!-- 
	1단부터 100단 까지 중 사용자에게 입력한 단수로 구구단 출력하기
	입력받은 값이 정수인지 아닌지 판단, 값을 입력했는지 안했는지 판단
	다른 페이지 이동 없이 현재 페이지에서만 기능 구현
	자바스크립트 사용 가능
 -->
	<form name = "frm">
		 <input type = "text" id = "num" name = "num" placeholder="정수입력">
		 <input type = "button" onclick="sendit()" value = "확인">
	</form>
 	<c:choose>
 		<c:when test="${not empty param.num}">
 			구구단 결과<br>
 			<c:forEach var= "i" begin="1" end = "9">
 				<c:out value = "${param.num} * ${i} = ${param.num * i}"></c:out><br>
 			</c:forEach>
 		</c:when>
 	</c:choose>
</body>
<script>
	/* 엔터를 막아준다 */
	document.addEventListener('keydown', function(event) {
	  if (event.keyCode === 13) {
	    event.preventDefault();
	  };
	}, true);
	
 function sendit() {
	var frm = document.frm;
	var data = frm.num.value;
	//var check = parseFloat(data) - parseInt(data) == 0.0;
	var check = data % 1 == 0
	
/* 	if(!Number.isInteger(parseInt(frm.num.value)) || frm.num.value == "" || frm.num.value.includes(".")){ */
	if(!Number.isInteger(parseInt(frm.num.value)) || frm.num.value == "" || !check){
		alert("정수를 입력하세요.");
		location.reload();
		return false;
	}
	if(frm.num.value > 100){
		alert("100단까지만 가능합니다."); 
		return false;
	}
	//.0을 정수로 바꿔준다
	frm.num.value = parseInt(data);
	frm.submit();
}
	
</script>
</html>