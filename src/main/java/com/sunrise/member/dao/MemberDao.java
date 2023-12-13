package com.sunrise.member.dao;

import com.sunrise.member.vo.MemberVO;

public interface MemberDao {
	void memberInsert(MemberVO memberVO) throws Exception;
	
	int idCnt(MemberVO memberVO) throws Exception;
}
