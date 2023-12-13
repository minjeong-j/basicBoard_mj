package com.sunrise.board.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sunrise.board.vo.BoardVO;

@Repository("bDao")
public class BoardDaoImpl implements BoardDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<BoardVO> boardList() {
		return sqlSession.selectList("Board.boardList");
	}

	@Override
	public int daoTotalChk(String parameter) {
		return sqlSession.selectOne("Board.totalChkMapper");
	}
	
	//4월 4일 
	@Override
	public int insertList(BoardVO boardVO) {
		return sqlSession.insert("Board.boardInsert", boardVO);
	}

	@Override
	public int selectListCount() {
		return 0;
	}

	@Override
	public int update(BoardVO boardVO) {
		return sqlSession.update("Board.boardUpdate", boardVO);
	}

	@Override
	public BoardVO detail(int bOARD_NUM) {
		return sqlSession.selectOne("Board.detail", bOARD_NUM);
	}

	@Override
	public int delete(int boardNum) {
		return sqlSession.delete("Board.delete", boardNum);
	}

//	@Override
//	public List<UserInfoVO> userList() {
//		return sqlSession.selectList("Board.userList");
//	}
	
}
