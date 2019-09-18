package com.my.blog.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.my.blog.member.dao.MemberDAO;
import com.my.blog.member.vo.MemberVO;
import com.my.blog.member.vo.User;


@Service("memberService")
public class MemberSerivce {
	@Autowired
	private MemberDAO memberDAO;

	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDAO.insertMember(vo);
	}
	public MemberVO getMember(MemberVO vo) {
		return memberDAO.getMember(vo);
	}
}
