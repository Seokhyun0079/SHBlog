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
		freeboardCommentDAO.insertComment(vo);
	}
	public int getCommentCount(FreeboardComment vo) {
		return freeboardCommentDAO.getCommentCount(vo);
	}
}
