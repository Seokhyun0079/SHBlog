package com.my.blog.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.my.blog.member.vo.MemberVO;
import com.my.blog.util.SqlSessionFactoryBean;

@Repository
public class MemberDAO {
	private SqlSession mybatis;
	public MemberDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	public void insertMember(MemberVO vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
		mybatis.commit();
	}
	public void deleteBoard(MemberVO vo) {
		mybatis.delete("MemberDAO.deleteMember", vo);
		mybatis.commit();
	}
	public MemberVO getMember(MemberVO vo) {
		return (MemberVO) mybatis.selectOne("MemberDAO.getMemberByInfo", vo);
	} 
}
