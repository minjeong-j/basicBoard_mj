package com.sunrise.member.service;

import com.sunrise.member.vo.MemberVO;

public interface MemberService {
	void memberInsert(MemberVO memberVO) throws Exception;
	
	int idCnt(MemberVO memberVO) throws Exception;
}
