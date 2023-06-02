package com.koreait.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.koreait.domain.BoardVO;
import com.koreait.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
//	@Test
//	public void testGetBoardList() {
//		service.getBoardList(new Criteria()).forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testGetTotal() {
//		log.info("총 갯수 : "+service.getTotal(new Criteria()));
//	}
	
//	@Test
//	public void testGetBoard() {
//		log.info("가져온 게시글 : "+service.getBoard(174L));
//	}
	
//	@Test
//	public void testDeleteBoard() {
//		if(service.remove(173L)) {
//			log.info("성공");
//		}else {
//			log.info("실패");
//		}
//	}
//	@Test
//	public void testBoardWrite() {
//		BoardVO board = new BoardVO();
//		board.setTitle("안녕하세요1");
//		board.setContent("네1");
//		board.setWriter("누구1");
//		if(service.boardWrite(board)) {
//			log.info("성공");
//		}else {
//			log.info("실패");
//		}
//	}
	@Test
	public void testModify() {
		BoardVO board = new BoardVO();
		board.setBno(183L);
		board.setTitle("안녕하세요1");
		board.setContent("네1");
		board.setWriter("누구1");
		if(service.modify(board)) {
			log.info("성공");
		}else {
			log.info("실패");
		}
	}
}
