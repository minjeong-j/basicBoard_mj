package com.sunrise.board.mapper;

import java.util.List;

import com.sunrise.board.vo.BoardVO;

public interface BoardMapper {
	int insertList(List list);
	int updateList(List list);
	int deleteList(List list);
	
	List<BoardVO> boardList();
	
}
