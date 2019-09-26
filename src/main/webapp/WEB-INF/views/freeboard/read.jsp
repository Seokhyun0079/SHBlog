<%@ page import="com.my.blog.freeboard.vo.FreeboardArticle" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${freeboardArticle.title}</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/my_blog.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="/resources/js/freeboard-comment.js"></script>
	<script src="/resources/js/chat-log.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/sementic/header.jsp" %>
<%@ include file="/WEB-INF/views/sementic/nav.jsp" %>
<section>
<article>
<form action = "/my/freeboard/article/write.do" method ="post">
	<br><h1>자유게시판</h1>
	<br><div>${freeboardArticle.id}</div><br>
	<div class= "input-border">${freeboardArticle.title }</div><br>
	<br>
	<div class="content">${freeboardArticle.content }</div><br>

	<a href="/resources/upload/${freeboardArticle.fileName}">${freeboardArticle.fileName}</a><br><br>
	<img onerror ='this.src="/resources/image/filenotfound.jpg"' width="320px" src="/resources/upload/${freeboardArticle.fileName}"><br><br>
    <span style="color : #515151;"><fmt:formatDate value="${freeboardArticle.regDate}" pattern="yyyy년 MM월 dd일 hh시 mm분에 작성된 글입니다. "/></span><br><br>
	<a class="btn btn-danger remove-margin" href ="/freeboard/article/read.do?articleNo=${freeboardArticle.articleNo-1}" >이전글</a><a class="btn btn-danger remove-margin" href ="/freeboard/main.do" >게시글 목록</a><a  href ="/freeboard/article/read.do?articleNo=${freeboardArticle.articleNo+1}" class="btn btn-danger remove-margin" >다음글</a><br><br><br>
</form>
</article>
<article>
	<%@ include file="/WEB-INF/views/commons/comment.jsp" %>
</article>
</section>
<aside>
	<%@ include file="/WEB-INF/views/sementic/aside.jsp" %>
</aside>
</body>
</html>