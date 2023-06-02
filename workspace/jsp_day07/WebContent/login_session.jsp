<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String user_id = "";
   if(session.getAttribute("user_id") != null){
      user_id = (String)session.getAttribute("user_id");
   }
   if(!user_id.equals("")){
%>
   <p><%=user_id %>님 환영합니다.</p>
   <p>아이디 : <%=user_id %></p>
   <p><a href="logout_session.jsp">[로그아웃]</a></p>
<%
   }else{
%>
   <form name="loginForm" method="post" action="login_ok.jsp">
      <p><label>아이디 : <input type="text" name="user_id"></label></p>
      <p><label>패스워드 : <input type="password" name="pwd"></label></p>
      <p><input type="button" value="로그인" onclick="sendIt()"></p>
      <p><a href = "join.jsp">회원가입</a></p>
   </form>
<%
   }
%>
</body>
<script>
   function sendIt(){
      var frm = document.loginForm;
      if(frm.user_id.value == ""){
         alert("아이디를 입력해주세요.");
         frm.user_id.focus();
         return false;
      }
      
      if(frm.pwd.value == ""){
         alert("패스워드를 입력해주세요.");
         frm.pwd.focus();
         return false;
      }
      
      frm.submit();
   }
</script>
</html>








