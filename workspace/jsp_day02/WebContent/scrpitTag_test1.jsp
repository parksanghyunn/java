<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Script Tag</h2>
	<%!
		//선언문 태그를 사용해서 자바변수와 메소드 정의
		int cnt = 3; //전역변수
		
		String makeItBeLower(String data){
			return data.toLowerCase();
		}
	%>
	
	<%
		//스크립틀릿 태그로 자바 로직 코드 작성
		for(int i =1; i<=cnt; i++){
			out.println("Java Server Pages"+i+".<br>");
		}
	%>
	<!-- HTML 주석은 컴파일이 모두 되고나서 페이지에서 보이지 않게 된다. -->
	<%--JSP 주석은 안에 작성된 모든 코드가 무시되므로 JSP주석을 권장한다 --%>
	
	<%--표현문 태그로 선언문 메소드 호출 --%>
	<%-- 표현문은 서블릿의 out.print()메소드의 매개변수에 전달되기 때문에 세미콜론을 사용하면 안된다 --%>
	<h3><%=makeItBeLower("Hello World") %></h3>
	
</body>
</html>