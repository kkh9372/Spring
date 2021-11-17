package kr.co.farmstory.dao;

import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.MemberVo;
import kr.co.farmstory.vo.TermsVo;

@Repository
public interface MemberDao {
	
	public void insertMember();
	
	public int selectCountUid(String uid);
	public TermsVo selectTerms();
	public MemberVo selectMember(String uid, String pass);
	public void selectMembers();
	public void updateMember();
	public void deleteMember();
	
}
