package com.sunrise.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunrise.member.dao.MemberDao;
import com.sunrise.member.vo.MemberVO;

@Service("mService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao mDao;
	
	@Override
	public void memberInsert(MemberVO memberVO) throws Exception {
		mDao.memberInsert(memberVO);
	}

	@Override
	public int idCnt(MemberVO memberVO) throws Exception {
		return mDao.idCnt(memberVO);
	}
}	
