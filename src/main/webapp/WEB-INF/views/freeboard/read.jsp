<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/my_blog.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/resources/js/freeboard-comment.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/sementic/header.jsp" %>
<%@ include file="/WEB-INF/views/sementic/nav.jsp" %>
<section>
<article>
<form action = "/my/freeboard/article/write.do" method ="post">
	<br><h1>자유게시판</h1>
	<div class= "input-border">${freeboardArticle.title }</div><br>
	<br>
	<div class="content">${freeboardArticle.content }</div><br>
	<button type ="submit" class="btn btn-danger remove-margin" >이전글</button><button type ="submit" class="btn btn-danger remove-margin" >게시글 목록</button><button type ="submit" class="btn btn-danger remove-margin" >다음글</button><br><br><br>
</form>
</article>
<article>
	<%@ include file="/WEB-INF/views/commons/comment.jsp" %>
</article>	
</section>
<aside>
	하루하루살이 몽유병 브라더스 : 라로로 고명빈
</aside>
</body>
</html>