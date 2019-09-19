package com.my.blog.freeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.blog.freeboard.dao.FreeboardCommentDAO;
import com.my.blog.freeboard.vo.FreeboardComment;
@Service("freeboardCommentService")
public class FreeboardCommentService {
	@Autowired
	private FreeboardCommentDAO freeboardCommentDAO;
	
	public List<FreeboardComment> getCommentList(FreeboardComment vo){
		return freeboardCommentDAO.getCommentList(vo);
	}
	public void insertComment(FreeboardComment vo) {
		System.out.println("[FreeboardCommentService] insertComment");
        vo.setCommentNo(freeboardCommentDAO.getCommentNo(vo)+1);
		freeboardCommentDAO.insertComment(vo);
		freeboardCommentDAO.commit();
	}
	public int getCommentCount(FreeboardComment vo) {
		return freeboardCommentDAO.getCommentCount(vo);
	}
}
