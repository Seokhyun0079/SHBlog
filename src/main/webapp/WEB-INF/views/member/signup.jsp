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
<header>
<div class="titleBar"><img src = "resources/shmark_madeKoo.png" style = "height : 100%; float :right;"><input type="text" style = "height :29px; float:right;"></div>
</header>
<div style= "border : 2px solid white; border-top :0px; width : 50%; margin-left: auto; margin-right: auto;">
	<form action="signup.do" method="post">
	<div class = "login-form">
		<h1>회원 가입</h1>
		<br>아이디<br>
		<input type = "text" name = "id"><br>
		<br>패스워드<br>
		<input type = "password" name = "password"><br>
		<br>이름<br>	
		<input type = "text" name="name"><br>
		<br>이메일<br>
		<input type= "text" name="email"><br><br>
		<button type ="submit" class="btn btn-danger" >회원가입</button><br>
	</div>
	</form>
</div>
</body>
</html>