package com.my.blog.member.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.blog.member.dao.MemberDAO;
import com.my.blog.member.service.MemberSerivce;
import com.my.blog.member.vo.MemberVO;
import com.my.blog.member.vo.User;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberSerivce memberSerivce;

	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
	public String signupMemberPost(MemberVO vo) throws IOException {
		// 파일 업로드 처리
		System.out.println("[MemberController] /signup.do Post");
		memberSerivce.insertMember(vo);
		return "/WEB-INF/views/member/signin.jsp";
	}
	@RequestMapping(value ="/signup.do", method = RequestMethod.GET)
	public String signupMemberGet() {
		System.out.println("[MemberController] /signup.do Get");
		return "/WEB-INF/views/member/signup.jsp";
	}

	@RequestMapping(value = "/signin.do", method = RequestMethod.POST)
	public String signinMemberPost(MemberVO vo,  HttpSession session) {
		System.out.println("[MemberController] /login.do Post");
		if (vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		MemberVO member = memberSerivce.getMember(vo);
		if(member!= null) {
			User user = new User(member.getId(), member.getName());
			session.setAttribute("authUser", user);
			return "index.jsp";
		}
		return "/WEB-INF/views/member/signin.jsp";
	}
	@RequestMapping(value = "/signin.do", method = RequestMethod.GET)
	public String signinMemberGet() {
		System.out.println("[MemberController] /login.do Get");
		return "/WEB-INF/views/member/signin.jsp";
	}
	@RequestMapping("/signout.do")
	public String signoutMember(HttpSession session) {
		session.invalidate();
		return "/WEB-INF/views/member/signin.jsp";
	}
}
