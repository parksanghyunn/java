package com.koreait.mapper;

import java.util.List;

import com.koreait.domain.BoardVO;
import com.koreait.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO> getBoardList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public BoardVO getBoard(Long bno);
	
	public int deleteBoard(Long bno);
	
	public int insertBoard(BoardVO board);
	
	public int updateBoard(BoardVO board);
	
}
