<%@page import="com.psh.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class = "com.psh.dao.MemberDAO" id="m_dao"></jsp:useBean>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%
	//httpREquest.send()로 받은 email값을 String email에 저장한다.
	String email = request.getParameter("email");
	
	//MemberDAO에 check메소드를 통해 중복 여부를 판단하고, true일 경우 ok를 출력한다.
	if(m_dao.check(email)){
		out.println("ok");
	}else{
		out.println("n_ok");
	}
%>
