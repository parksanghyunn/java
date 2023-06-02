package com.koreait.app.board;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.FilesDAO;
import com.koreait.app.board.vo.FilesVO;

public class BoardDeleteOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		BoardDAO b_dao = new BoardDAO();
		FilesDAO f_dao = new FilesDAO();
		
		ActionForward forward = new ActionForward();
		
		int board_num = Integer.parseInt(request.getParameter("seq"));
		
		String saveFolder = "D:\\GB_0900_07_hds\\JSP\\workspace\\board_mvc2\\WebContent\\app\\upload";
		
		for(FilesVO file : f_dao.getDetail(board_num)) {
			File f = new File(saveFolder + "\\" + file.getFile_name());
			if(f.exists()) {
				f.delete();
			}
		}
		
		f_dao.deleteFiles(board_num);
		b_dao.deleteAllReply(board_num);
		b_dao.deleteBoard(board_num);
		
		forward.setRedirect(true);
		forward.setPath(request.getContextPath() + "/board/BoardList.bo");
		
		return forward;
	}
}