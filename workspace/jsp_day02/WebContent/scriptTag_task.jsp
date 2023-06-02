<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그 실습</title>
</head>
<body>
	<!--  
		ㅁ
		ㅁㅁ
		ㅁㅁㅁ
		ㅁㅁㅁㅁ
		ㅁㅁㅁㅁㅁ
		ㅁㅁㅁㅁㅁ
		ㅁㅁㅁㅁ
		ㅁㅁㅁ
		ㅁㅁ
		ㅁ	
		
		위 모양과 똑같은 테이블 만들기
	-->
<table>
   <%for(int i=0; i<5; i++) {%>
   <tr>
      <%for(int j=0; j <i+1; j++) {%>
      <td>□</td>
      <%}%>
   </tr>
   <%}%>
   <%for(int i=5; i>0; i--) {%>
   <tr>
      <%for(int j=0; j <i; j++) {%>
      <td>□</td>
      <%}%>
   </tr>
   <%}%>
</table>
</body>
</html>