<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<nav>
   <ul>
        <u:isLogin>
        	<li><a href="/signout.do">로그아웃 </a></li>
        </u:isLogin>
        <u:notLogin>
	      <li><a href="/signin.do">로그인 </a></li>
            <li><a href="/signup.do">회원가입</a></li>
        </u:notLogin>
   </ul>
</nav>