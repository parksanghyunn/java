<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class = "com.koreait.dao.MemberDAO" id="m_do"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String user_id = request.getParameter("user_id");
   String pwd = request.getParameter("pwd");
   
   if(m_do.login(user_id, pwd)){
      session.setAttribute("user_id", user_id);
      response.sendRedirect("login_session.jsp");
   }else{
%>
   <script>
      alert("아이디 또는 패스워드를 확인해 주세요");
      location.href = "login_session.jsp";
   </script>
<%      
   }
%>
</body>
</html>