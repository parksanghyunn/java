package com.koreait.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.koreait.domain.Criteria;
import com.koreait.domain.ReplyVO;
import com.koreait.service.BoardServiceTests;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//SpringRunner는 SpringJUnit4ClassRunner의 자식이며 4.3버전 이상부터 사용 가능한 확장판이다
@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Setter(onMethod_= {@Autowired})
	private ReplyMapper mapper;
	
//	@Test
//	public void testMapper() {
//		log.info(mapper);
//	}
	private Long [] arBno = {597082L,597083L,597084L,597085L,597086L};
	
	@Test
	public void testInsert() {
		ReplyVO reply = new ReplyVO();
		//IntStream.range(597081, 597087).forEach(bno-> {
		IntStream.rangeClosed(1, 50).forEach(i-> {
			//12340 12340
			reply.setBno(206L);
			reply.setReply("댓글"+i);
			reply.setReplyer("댓글 작성자"+i);
			log.info(mapper.insert(reply));
		});
		
	}
	
//	@Test
//	public void testRead() {
//		log.info(mapper.read(16L));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info(mapper.delete(16L));
//	}
	
//	@Test
//	public void testUpdate() {
//		ReplyVO reply = new ReplyVO();
//		reply.setRno(17L);
//		reply.setReply("수정한 댓글");
//		log.info(mapper.update(reply));
//	}
	
//	@Test
//	public void testList() {
//		Criteria cri = new Criteria();
//		
//		List<ReplyVO> list = mapper.getListWithPaging(cri, 598019L);
//		list.forEach(reply ->log.info(reply));
//	}
}
