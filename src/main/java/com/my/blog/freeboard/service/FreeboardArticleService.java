package com.my.blog.freeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.blog.freeboard.dao.FreeboardArticleDAO;
import com.my.blog.freeboard.vo.FreeboardArticle;

@Service("freeboardArticleService")
public class FreeboardArticleService {
	@Autowired
	private FreeboardArticleDAO freeboardArticleDAO;
	public void insertArticle(FreeboardArticle vo) {
		freeboardArticleDAO.insertArticle(vo);
		freeboardArticleDAO.commit();
	}
	public FreeboardArticle getArticle(FreeboardArticle vo) {
		freeboardArticleDAO.increaseReadCount(vo);
		freeboardArticleDAO.commit();
		return freeboardArticleDAO.getArticle(vo);
	}
	public List<FreeboardArticle> getArticleList(FreeboardArticle vo) {
		// TODO Auto-generated method stub
		vo.setStart(vo.getPage()*10);
		setSearchKeywordForm(vo);
		return freeboardArticleDAO.getArticleList(vo);
	}
	public int getArticleMaxPaage(FreeboardArticle vo){
		setSearchKeywordForm(vo);
		int articleCount = freeboardArticleDAO.getArticleCount(vo);
		return (articleCount/10 + ( articleCount % 10 == 0 ? 0 : 1));
	}

	public List<FreeboardArticle> getBest() {
		// TODO Auto-generated method stub
		return freeboardArticleDAO.getBest();
	}

	private void setSearchKeywordForm(FreeboardArticle vo){
		if(vo.getSearchCondition()!= null && !vo.getSearchCondition().equals("WRITER")){
			vo.setSearchKeyword("%"+vo.getSearchKeyword()+"%");
		}
	}
}
