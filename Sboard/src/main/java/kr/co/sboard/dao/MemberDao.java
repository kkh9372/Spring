package kr.co.sboard.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.MemberVo;
import kr.co.sboard.vo.TermsVo;

@Repository
public interface MemberDao {
	public void insertMember(MemberVo vo);
	public TermsVo selectTerms();
	public MemberVo selectMember(String uid, String pass);
	public List<MemberVo> selectMembers();
	public int selectCountUid(String uid);
	
	public void updateMember(MemberVo vo);
	public void deleteMember(String uid);
}
