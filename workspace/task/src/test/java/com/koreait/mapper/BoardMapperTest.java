package com.koreait.mapper;

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
public class BoardMapperTest {
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
//	@Test
//	public void testGetBoardList() {
//		mapper.getBoardList(new Criteria()).forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testGetTotal() {
//		log.info("게시글 총 갯수 : "+mapper.getTotal(new Criteria()));
//	}
	
//	@Test
//	public void testGetBoard() {
//		log.info("가져온 게시글 : "+mapper.getBoard(174L));
//	}
	
//	@Test
//	public void testDeleteBoard() {
//		if(mapper.deleteBoard(174L)==1) {
//			log.info("성공");
//		}else {
//			log.info("실패");
//		}
//	}
	
//	@Test
//	public void testInsertBoard() {
//		BoardVO board = new BoardVO();
//		board.setTitle("안녕하세요");
//		board.setContent("네");
//		board.setWriter("누구");
//		if(mapper.insertBoard(board) !=0) {
//			log.info("성공");
//		}
//	}
	@Test
	public void testUpdateBoard() {
		BoardVO board = new BoardVO();
		board.setBno(183L);
		board.setTitle("안녕요");
		board.setContent("네");
		board.setWriter("나");
		if(mapper.updateBoard(board) ==1) {
			log.info("성공");
		}
	}
}
