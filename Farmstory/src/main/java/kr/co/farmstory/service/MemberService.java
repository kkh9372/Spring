package kr.co.farmstory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory.dao.MemberDao;
import kr.co.farmstory.vo.MemberVo;
import kr.co.farmstory.vo.TermsVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	public void insertMember() {}
	
	public int selectCountUid(String uid) {
		return dao.selectCountUid(uid);
	}
	public TermsVo selectTerms() {
		return dao.selectTerms();
	}
	public MemberVo selectMember(String uid, String pass) {
		return dao.selectMember(uid, pass);
	}
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
}
