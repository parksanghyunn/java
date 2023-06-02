package com.koreait.app.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;

public class BoardListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		ActionForward forward = new ActionForward();
		BoardDAO b_dao = new BoardDAO();
		
		String temp = request.getParameter("page");
		
		int page = temp == null ? 1 : Integer.parseInt(temp);
		int pageSize = 10;
		
		int endRow = page*pageSize;
		int startRow = endRow-(pageSize-1);
		
		//1.board.xml에 전체 게시글 개수를 가져오는 쿼리문 작성
		//2.BoardDAO에 위에서 작성한 쿼리문을 사용하는 메소드 구현
		//3.Controller(현재페이지)에서 DAO메소드 사용 후 totalCnt에 대입
		int totalCnt = b_dao.getTotalCnt();
		int startPage = (page-1)*pageSize+1;
		int endPage = startPage+9;
		int totalPage = (totalCnt-1)/pageSize+1;
		
		endPage = endPage > totalPage ? totalPage : endPage;
		
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("totalCnt", totalCnt);
		request.setAttribute("nowPage", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("boardList", b_dao.getBoardList(startRow, endRow));
		
		forward.setRedirect(false);
		forward.setPath("/app/board/boardList.jsp");
		
		return forward;
	}
}
