package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.domain.BoardVO;


public interface BoardMapper {
	//@Select("select * from mvc_board where bno>0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	public BoardVO read(Long bno);
}
