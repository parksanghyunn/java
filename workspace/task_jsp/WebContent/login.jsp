<%@page import="com.koreait.dao1.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class = "com.koreait.dao1.MemberDAO" id = "m_dao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String email = request.getParameter("email");
   String pw = request.getParameter("pw");
   
   if(m_dao.login(email, pw)){
      session.setAttribute("email", email);
      response.sendRedirect("login_ok.jsp");
   }else{
%>
   <script>
      alert("아이디 또는 패스워드를 확인해 주세요");
      location.href = "login.html";
   </script>
<%      
   }
%>
</body>
</html>