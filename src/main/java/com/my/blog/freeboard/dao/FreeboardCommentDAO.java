package com.my.blog.freeboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.my.blog.freeboard.vo.FreeboardComment;
import com.my.blog.util.SqlSessionFactoryBean;

@Repository
public class FreeboardCommentDAO {
	private SqlSession mybatis;
	
	public FreeboardCommentDAO() {
		this.mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	public void insertComment(FreeboardComment vo) {
		System.out.println("[FreeboardCommentDAO] insertComment");
		mybatis.insert("freeboardCommentDAO.", vo);
	}
	public List<FreeboardComment> getCommentList(FreeboardComment vo){
		System.out.println("[FreeboardCommentDAO] getCommentList");
		return mybatis.selectList("freeboardCommentDAO.getCommentList", vo);
	}
	public int getCommentCount(FreeboardComment vo) {
		// TODO Auto-generated method stub
		System.out.println("[FreeboardCommentDAO] getCommentCount");
		return (Integer)mybatis.selectOne("freeboardCommentDAO.getCommentCount", vo);
	}
	public void commit() {
		mybatis.commit();
	}
}
