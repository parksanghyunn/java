package com.koreait.app.board;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionForward;
import com.koreait.app.board.dao.BoardDAO;
import com.koreait.app.board.dao.FilesDAO;
import com.koreait.app.board.vo.FilesVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardDeleteOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		BoardDAO b_dao = new BoardDAO();
		FilesDAO f_dao = new FilesDAO();
		ActionForward forward = new ActionForward();
		
		System.out.println("들어옴3");
		MultipartRequest multi = null;
		
		try {
			String saveFolder = "C:\\psh_java\\workspace\\board_mvc2\\WebContent\\app\\upload";
			int fileSize = 5* 1024 * 1024;
			
			int board_num = Integer.parseInt(request.getParameter("seq"));
			for (FilesVO f : f_dao.getDetail(board_num)) {
				File file = new File(saveFolder+"\\"+f.getFile_name());
				if(file.exists()) {
					file.delete();
				}
			}
			f_dao.deleteFiles(board_num);
			b_dao.deletBoardReply(board_num); 
			b_dao.deleteBoard(board_num);
			
			forward.setRedirect(true);
			forward.setPath(request.getContextPath()+"/board/BoardList.bo");
			
			return forward;
			
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html;charset=UTF-8");
			out.println("<script>");
			out.println("alert('게시물 삭제 실패');");
			out.println("</script>");
			out.close();
		}
		
		return null;
	}
}
