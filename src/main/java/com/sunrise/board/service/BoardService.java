package com.sunrise.board.service;

import java.util.List;
import com.sunrise.board.vo.BoardVO;

public interface BoardService {
		List<BoardVO> boardList();
		int totalCheckerLogic(String parameter);
//		List<UserInfoVO> userList(String parameter);
		
		int insertList(BoardVO boardVO);
		int update(BoardVO boardVO);
		int delete(int board_Num);
		
		int selectListCount();
		
		//게시판 상세
		BoardVO detail(int bOARD_NUM);
}
