package org.zerock.mapper;

import java.sql.Date;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	/*
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로작성하는 제목");
		board.setContent("새로작성하는 내용");
		board.setWriter("newbie");
		
		mapper.insert(board);
		log.info(board);
	}
	*/
	/*
	@Test
	public void testRead() {
		BoardVO board = mapper.read(12L);
	}
	*/
	/*
	@Test
	public void testDelete() {
		log.info("DELETE COUNT: " +mapper.delete(12L));
	}
	*/
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(13L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String today = null;
		today = formatter.format(cal.getTime());
		Timestamp ts = Timestamp.valueOf(today);
		System.out.println( " 여기야 여기! Timestamp : " + ts);
		board.setUpdateDate(ts);
		System.out.println("22222"+board.getUpdateDate());
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}
	
	
}
