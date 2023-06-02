package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.vo.BoardReplyVO;

public class BoardReplyOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		ActionForward forward = null;
		
		HttpSession session = request.getSession();
		BoardReplyVO r_vo = new BoardReplyVO();
		BoardDAO r_dao = new BoardDAO();
		
		int board_num = Integer.parseInt(request.getParameter("seq"));
		String member_id = (String)session.getAttribute("session_id");
		String reply_contents = request.getParameter("reply_contents");
		
		r_vo.setBoard_num(board_num);
		r_vo.setMember_id(member_id);
		r_vo.setReply_contents(reply_contents);
		
		//사용자가 작성한 댓글 정보를 insertReply로 전달하여 DB에 추가한다
		if(r_dao.insertReply(r_vo)) {
			forward = new ActionForward();
			forward.setRedirect(true);										//댓글 작성한 게시글로 돌아간다
			forward.setPath(request.getContextPath() + "/board/BoardView.bo?seq="+board_num);
		}
		
		return forward;
	}
}















