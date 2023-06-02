package com.koreait.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.koreait.domain.BoardVO;
import com.koreait.domain.Criteria;
import com.koreait.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BoardServiceImp implements BoardService{
	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getBoardList(Criteria cri) {
		log.info("getBoardList...");
		return mapper.getBoardList(cri);
	}
	
	@Override
	public int getTotal(Criteria cri) {
		log.info("getTotal");
		return mapper.getTotal(cri);
	}
	
	@Override
	public BoardVO getBoard(Long bno) {
		log.info("getBoard..");
		return mapper.getBoard(bno);
		
	}
	
	@Override
	public boolean remove(Long bno) {
		log.info("remove..");
		if(mapper.deleteBoard(bno)==1) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean boardWrite(BoardVO board) {
		log.info("boardWrite");
		if(mapper.insertBoard(board) != 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean modify(BoardVO board) {
		if(mapper.updateBoard(board) == 1) {
			return true;
		}
		return false;
	}
}
