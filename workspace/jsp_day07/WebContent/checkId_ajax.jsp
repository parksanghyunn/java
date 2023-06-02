<%@page import="com.koreait.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class = "com.koreait.dao.MemberDAO" id="m_do"></jsp:useBean>
<%
	String user_id = request.getParameter("id");
	//System.out.println(user_id);
	//DB 처리
	if(!m_do.checkId(user_id)){
		out.println("ok");
	}else{
		out.println("not-ok");
	}
%>