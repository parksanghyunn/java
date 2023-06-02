package com.koreait.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.board.vo.BoardVO;
import com.koreait.mybatis.config.SqlMapConfig;

public class BoardDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public BoardDAO() {
		sqlsession = sessionf.openSession(true);
	}
	
	public List<BoardVO> getBoardList(int startRow, int endRow) {
		HashMap<String, Integer> pageMap = new HashMap<>();
		
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		List<BoardVO> BoardList = sqlsession.selectList("Board.listAll",pageMap);
		
		return BoardList;
	}
	
	public int getTotalCnt() {
		int totalPage = sqlsession.selectOne("Board.totalCnt");
		
		return totalPage;
	}
}
