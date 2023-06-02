<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class = "com.psh.dao.MemberDAO" id="m_dao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//submit()을 통해 받아온 email과 pw를 객체에 담아둔다
   String email = request.getParameter("email");
   String pw = request.getParameter("pw");
   
   //MemberDAO의 login메소드에 email과 pw를 보내 존재여부를 판별하고 true가 리턴되면 if안으로 들어간다
   if(m_dao.login(email, pw)){
	   //로그인 sql문이 성공적으로 처리되었으면 session에 email값을 담아주도 login_ok.jsp로 넘어단다
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