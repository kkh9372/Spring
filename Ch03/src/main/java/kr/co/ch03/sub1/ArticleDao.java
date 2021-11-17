package kr.co.ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		advice.beforeAdvice1();
		System.out.println("ÇÙ½É°ü½É -- insertArticle");
		advice.afterAdvice1();
	}
	
	public void selectArticle() {
		System.out.println("ÇÙ½É°ü½É -- selectArticle");
	}
	
	public void updateArticle() {
		System.out.println("ÇÙ½É°ü½É -- updateArticle");
	}
	
	public void deleteArticle() {
		System.out.println("ÇÙ½É°ü½É -- deleteArticle");
	}
}
