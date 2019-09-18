package com.my.blog.freeboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.my.blog.freeboard.vo.FreeboardArticle;
import com.my.blog.util.SqlSessionFactoryBean;
@Repository
public class FreeboardArticleDAO {
	private SqlSession mybatis;

	public FreeboardArticleDAO() {
		this.mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	public void insertArticle(FreeboardArticle vo) {
		System.out.println("[FreeboardArticleDAO] insertArticle");
		mybatis.insert("FreeboardArticleDAO.insertArticle", vo);
	}
	public FreeboardArticle getArticle(FreeboardArticle vo) {
		System.out.println("[FreeboardArticleDAO] getArticle");
		return (FreeboardArticle)mybatis.selectOne("FreeboardArticleDAO.getArticle", vo);
	}
	public List<FreeboardArticle> getArticleList(FreeboardArticle vo){
		System.out.println("[FreeboardArticleDAO] getArticleList");
		return mybatis.selectList("FreeboardArticleDAO.getArticleList", vo);
	}
	public List<FreeboardArticle> getBest() {
		// TODO Auto-generated method stub
		System.out.println("[FreeboardArticleDAO] getBest");
		return mybatis.selectList("FreeboardArticleDAO.getBest");
	}
	public void increaseReadCount(FreeboardArticle vo) {
		System.out.println("[FreeboardArticleDAO] increaseReadCount");
		mybatis.update("FreeboardArticleDAO.increaseReadCount", vo);
	}
	public void commit() {
		mybatis.commit();
	}
}
