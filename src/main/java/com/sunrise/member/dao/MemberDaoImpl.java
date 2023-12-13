package com.sunrise.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunrise.member.vo.MemberVO;

@Repository("mDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void memberInsert(MemberVO memberVO) throws Exception {
		sqlSession.insert("Member.memberInsert", memberVO);
	}

	@Override
	public int idCnt(MemberVO memberVO) throws Exception {
		return sqlSession.selectOne("Member.idCnt", memberVO);
	}
}
