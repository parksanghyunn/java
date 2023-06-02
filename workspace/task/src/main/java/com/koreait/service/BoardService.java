package com.koreait.service;

import java.util.List;

import com.koreait.domain.BoardVO;
import com.koreait.domain.Criteria;

public interface BoardService {
	public List<BoardVO> getBoardList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public BoardVO getBoard(Long bno);
	
	public boolean remove(Long bno);
	
	public boolean boardWrite(BoardVO board);
	
	public boolean modify(BoardVO board);
}
