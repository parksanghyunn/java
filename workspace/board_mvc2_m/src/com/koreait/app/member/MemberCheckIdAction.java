package com.koreait.app.member;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.member.dao.MemberDAO;

public class MemberCheckIdAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		MemberDAO m_do = new MemberDAO();
		PrintWriter out  = response.getWriter();
		
		String member_id = request.getParameter("member_id");
	//	System.out.println(member_id);
		response.setContentType("text/html;charset = UTF-8");
		if(!m_do.checkId(member_id)) {
			out.println("ok");
		}else {
			out.println("no");
		}
		return null;
	}
/*	public void check(HttpServletRequest request, HttpServletResponse resp) throws IOException {
		
		MemberDAO m_do = new MemberDAO();
		PrintWriter out  = resp.getWriter();
		
		String member_id = request.getParameter("member_id");
	//	System.out.println(member_id);
		
		if(!m_do.checkId(member_id)) {
			out.println("ok");
		}else {
			out.println("no");
		}
		out.close();
	}*/
}
