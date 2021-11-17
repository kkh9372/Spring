package kr.co.sboard.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.ArticleVo;
import kr.co.sboard.vo.FileVo;

@Repository
public interface BoardDao {
	
	public int insertArticle(ArticleVo vo);
	public void insertFile(FileVo vo);
	
	public ArticleVo selectArticle(int seq);
	public List<ArticleVo> selectArticles(int start);
	public int selectCountTotal();
	public FileVo selectFile(int fseq);
	
	public void updateArticle(int seq);
	public void updateFileDownload(int fseq);
	
	public void deleteArticle(int seq);
}
