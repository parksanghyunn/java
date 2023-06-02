<%@page import="com.koreait.dao.MemberDAO"%>
<%@page import="com.koreait.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="com.koreait.vo.MemberVO" id="m_vo"/>
<jsp:setProperty property="*" name="m_vo"/>
<jsp:useBean class = "com.koreait.dao.MemberDAO" id="m_do"></jsp:useBean>
<%
	System.out.println(m_vo);
	//DB 처리
	if(m_do.join(m_vo)){
		response.sendRedirect("join_ok.jsp");
	}else{
%>
	<script>alert("잠시후 다시 시도해 주세요")</script>
<% 		
	response.sendRedirect("join.jsp");
	}
%>
