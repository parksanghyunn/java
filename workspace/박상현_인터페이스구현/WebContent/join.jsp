<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 인코딩을 UTF-8로 맞춰준다 -->
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class = "com.psh.vo.MemberVO" id="m_vo"></jsp:useBean>
<jsp:useBean class = "com.psh.dao.MemberDAO" id="m_do"></jsp:useBean>
<jsp:setProperty property="*" name="m_vo"/>
<%
	//setProperty로 MemberVO에 객체 이름과 같으면 그 객체에 값을 담고 담은 값은 MemberDAO에 join에 보내,
	//insert한 후 성공여부를 리턴 받는다
	//성공시 join_ok로 이동 한다
	if(m_do.join(m_vo)){
		response.sendRedirect("join_ok.jsp");
	}else{
%>
	<script>alert("회원가입 실패")</script>
<%
	}
%>
