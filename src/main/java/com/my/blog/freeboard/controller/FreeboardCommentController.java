package com.my.blog.freeboard.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.blog.freeboard.service.FreeboardCommentService;
import com.my.blog.freeboard.vo.FreeboardComment;

import net.sf.json.JSONObject;

@Controller
public class FreeboardCommentController {
	@Autowired
	private FreeboardCommentService commentService;
	
	public FreeboardCommentController() {
		System.out.println("[FreeboardCommentController] 생성");
	}
	
	@RequestMapping("/freeboard/comment/list.do")
	public void getCommentList(FreeboardComment vo, HttpServletResponse res) {
		System.out.println("[FreeboardCommentController] /freeboard/comment/list.do -> getCommentList()");
		JSONObject obj = new JSONObject();
		obj.put("result", commentService.getCommentList(vo));
		obj.put("count", commentService.getCommentCount(vo));
		res.setContentType("application/x-json; charset=UTF-8");
		try {
			res.getWriter().print(obj);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/freeboard/comment/write.do")
	public void writeComment(FreeboardComment vo, HttpServletResponse res) {
		System.out.println("[FreeboardCommentController] /freeboard/comment/write.do -> wrtieComment()");
		commentService.insertComment(vo);
		JSONObject obj = new JSONObject();
		obj.put("result", commentService.getCommentList(vo));
		System.out.println("commentService.getCommentList(vo) " + commentService.getCommentList(vo).size());
		obj.put("count", commentService.getCommentCount(vo));
		res.setContentType("application/x-json; charset=UTF-8");
		try {
			res.getWriter().print(obj);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
