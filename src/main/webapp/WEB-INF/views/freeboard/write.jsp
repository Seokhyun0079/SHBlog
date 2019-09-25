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
</head>
<body>
<%@ include file="/WEB-INF/views/sementic/header.jsp" %>
<%@ include file="/WEB-INF/views/sementic/nav.jsp" %>
<section>
<article>
<form action = "/freeboard/article/write.do" method ="post" enctype="multipart/form-data">
	<br><h1>자유게시판</h1>
	<input type="text" class="input-text" name="title" placeholder="제목을 입력해주세요"><br>
	<br>
	<textarea name = "content" class="input-text" rows="20" placeholder="내용을 입력해주세요"></textarea>
	<div>
		<input id = "fileinput" style ="width : 0px; height : 0px;"  type = "file" name="uploadFile" onchange="$('#filename').val(this.value)">
		<input class="input-text" id="filename" type="text" readonly><label  class="btn btn-danger remove-margin" for="fileinput">업로드</label>
		<button type ="submit" class="btn btn-danger remove-margin" >글쓰기</button><br><br><br>
	</div>
</form>
</article>
</section>
<aside>
	하루하루살이 몽유병 브라더스 : 라로로 고명빈
</aside>
</body>
</html>