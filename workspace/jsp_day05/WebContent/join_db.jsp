<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean class="com.koreait.vo.MemberVO" id="m_vo"/>
<jsp:setProperty property="*" name="m_vo"/>
<%
	System.out.println(m_vo);
	//DB 처리
	Cookie cookie = new Cookie("name", m_vo.getName());
	response.addCookie(cookie);
	response.sendRedirect("join_ok.jsp");
%>
