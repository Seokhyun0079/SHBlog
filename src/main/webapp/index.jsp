<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/my_blog.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="/resources/js/my_blog.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/sementic/header.jsp" %>
<%@ include file="/WEB-INF/views/sementic/nav.jsp" %>
<section>
<article>
<h1>저의 개인 블로그에 오신 걸 환영합니다.</h1>
<p>욕설 금지 외엔 자유롭게 이용하셔도 무방합니다.</p>

</article>
<article>
<h1>자유게시판 BEST</h1><br>
<%@ include file="/WEB-INF/views/freeboard/best.jsp" %>
</article>
<article>
<h1>정보게시판 BEST</h1>
</article>
</section>
<aside>
	하루하루살이 몽유병 브라더스 : 라로로 고명빈
</aside>
<section>
<article>
<h1>자유게시판</h1>
<h1 class="float-right"><a href= "/freeboard/article/write.do">글쓰기</a></h1>
<%@ include file="/WEB-INF/views/freeboard/list.jsp" %>
</article>
</section>
</body>
</html>