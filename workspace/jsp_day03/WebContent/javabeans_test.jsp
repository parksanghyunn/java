<%@page import="com.koreait.beans.MemberDAO"%>
<%@page import="com.koreait.beans.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class = "com.koreait.beans.MemberVO" id="member"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <jsp:setProperty property="name" value="박상현" name = "member"/>
	<jsp:setProperty property="birthday" value="03-10" name = "member"/> --%>
	
	<jsp:getProperty property="name" name="member"/>
	<jsp:getProperty property="birthday" name="member"/>
	
	<!-- 
		table을 만들고 DAO의 메소드를 실행한 결과 값의 개수만큼 행을 만들어서 출력
	 -->
	 <table border = "1">
	 <% MemberDAO dao = new MemberDAO();
	 	ArrayList<MemberVO> members = dao.select("한동석");
	 	for(int i=0; i< members.size(); i++){ 
	 %>
	 	<tr>
	 		<td><%=members.get(i).getName() %></td>
	 		<td><%=members.get(i).getBirthday() %></td>
	 	</tr>
	 	<%} %>
	 </table>
</body>
</html>