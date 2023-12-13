package com.sunrise.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunrise.board.dao.BoardDao;
import com.sunrise.board.vo.BoardVO;

@Service("bbService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao bDao; 
	
	@Override
	public List<BoardVO> boardList(){
		List<BoardVO> list = bDao.boardList();
		return list;
	}
	
	@Override
	public int totalCheckerLogic(String parameter) {
		int result = bDao.daoTotalChk(parameter);
		return result;
	}
	//4월 4일
	@Override
	public int insertList(BoardVO boardVO) {
		return bDao.insertList(boardVO);
	}

	@Override
	public int update(BoardVO boardVO) {
		return bDao.update(boardVO);
	}

	@Override
	public int selectListCount() {
		return 0;
	}

	@Override
	public BoardVO detail(int bOARD_NUM) {
		return bDao.detail(bOARD_NUM);
	}

	@Override
	public int delete(int boardNum) {
		return bDao.delete(boardNum);
	}
	
	
}
