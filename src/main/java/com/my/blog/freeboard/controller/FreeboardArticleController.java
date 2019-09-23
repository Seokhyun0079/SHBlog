package com.my.blog.freeboard.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.blog.freeboard.service.FreeboardArticleService;
import com.my.blog.freeboard.vo.FreeboardArticle;
import com.my.blog.member.vo.User;

import net.sf.json.JSONObject;


@Controller
public class FreeboardArticleController {
	@Autowired
	private FreeboardArticleService freeboardArticleService;
	
	public FreeboardArticleController() {
		System.out.println("[FreeboardArticleController] 생성");
	}
	
	@RequestMapping(value = "/freeboard/article/write.do",  method = RequestMethod.POST)
	public String writeArticlePost(HttpSession session, FreeboardArticle vo) {
		System.out.println("[FreeboardController] /freeboard/article/write.do Post -> writeArticlePost()");
		vo.setId(((User)session.getAttribute("authUser")).getId());
		freeboardArticleService.insertArticle(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/freeboard/article/read.do")
	public String readArticle(FreeboardArticle vo, Model model) {
		System.out.println("[FreeboardController] /freeboard/article/read.do -> readArticle()");
		model.addAttribute("freeboardArticle", freeboardArticleService.getArticle(vo));
		return "/WEB-INF/views/freeboard/read.jsp";
	}
	@RequestMapping(value = "/freeboard/article/write.do",  method = RequestMethod.GET)
	public String writeArticleGet() {
		System.out.println("[FreeboardController] /freeboard/article/write.do Get");
		return "/WEB-INF/views/freeboard/write.jsp";
	}
	@RequestMapping("/freeboard/article/list.do")
	public void articleList(FreeboardArticle vo, HttpServletResponse res) {
		System.out.println("[FreeboardController] /freeboard/article/list.do -> articleList()");
		JSONObject obj = new JSONObject();
		obj.put("result", freeboardArticleService.getArticleList(vo));
		obj.put("maxPage", freeboardArticleService.getArticleMaxPaage());
		res.setContentType("application/x-json; charset=UTF-8");
		try {
			res.getWriter().print(obj);
		}catch(IOException e) {}
//		model.addAttribute("freeboardList", freeboardArticleService.getArticleList(vo));
	}
	@RequestMapping("/freeboard/article/best.do")
	public void articleBest(HttpServletResponse res) {
		System.out.println("[FreeboardController] /freeboard/article/best.do -> articleBest()");
		JSONObject obj = new JSONObject();
		obj.put("result", freeboardArticleService.getBest());
		res.setContentType("application/x-json; charset=UTF-8");
		try {
			res.getWriter().print(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
