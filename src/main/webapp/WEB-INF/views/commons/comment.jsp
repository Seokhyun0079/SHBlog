<%@page import="com.my.blog.member.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="margin-auto">
	<input id = "no" class="hidden-input"  type="text" value='${param.articleNo }'/>
	<input id = "count" class="hidden-input" type="text"/>
	<input id = "id" class="hidden-input" type="text" value ='${sessionScope.authUser.id }'/>
	<br>
	<input id = "content" type = "text">
	<button id = "reply_btn" type ="button" class="btn btn-danger remove-margin" >댓글등록</button>
	<div id="comment-list"></div>
</div>