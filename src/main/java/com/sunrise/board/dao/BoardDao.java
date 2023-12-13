package com.sunrise.board.dao;

import java.util.List;

import com.sunrise.board.vo.BoardVO;

public interface BoardDao {
	List<BoardVO> boardList();
	int daoTotalChk(String parameter);
	
	int insertList(BoardVO boardVO);
	int update(BoardVO boardVO);
	int delete(int boardNum);
	
	BoardVO detail(int bOARD_NUM); //상세보기
	
	int selectListCount();
}
