package com.koreait.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.member.dao.MemberDAO;

public class MemberLoginOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		MemberDAO m_do = new MemberDAO();
		
		String member_id = request.getParameter("member_id");
		String member_pw = request.getParameter("member_pw");
		String session_id = m_do.login(member_id, member_pw);
		
		if(session_id == null) {
			forward.setRedirect(false);
			//forward.setPath("/member/MemberLogin.me");
			
			//get방식으로 false를 넘겨준다.
			forward.setPath("/app/member/loginForm.jsp?login=false");
		}else {
			session.setAttribute("session_id", session_id);
			forward.setRedirect(true);
			forward.setPath(request.getContextPath()+"/board/BoardList.bo");
		}
		return forward;
	}
}
