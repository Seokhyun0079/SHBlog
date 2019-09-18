<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<style>
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/sementic/header.jsp" %>
<%@ include file="/WEB-INF/views/sementic/nav.jsp" %>
<div style= "border : 2px solid white; border-top :0px; width : 50%; margin-left: auto; margin-right: auto;">
	<form action="signin.do" method="post">
	<div class = "login-form">
		<h1>로그인</h1>
		<br>아이디<br>
		<input type = "text" class="input" name = "id"><br>
		<br>패스워드<br>
		<input type = "password" class="input" name = "password"><br>
		<button type ="submit" class="btn btn-danger input" >로그인</button><br>
	</div>
	</form>
</div>
</body>
</html>	