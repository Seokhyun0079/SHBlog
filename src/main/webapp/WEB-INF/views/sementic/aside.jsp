<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<input class="hidden-input" type="text" id="id" value="${sessionScope.authUser.id}">
<input class="hidden-input" type="text" id="count" value="">
<h1>채팅창 ui 추천받습니다</h1>
<br>
<div id="chat-box" style="margin-left: 20px; overflow-y:scroll; overflow-x: hidden; height :300px;" >
</div>
<br><br>
<u:isLogin>
<input id="message" class="input-border-remove"type="text"style="width: 100%">
<button  id="chat_btn" class="btn btn-danger remove-margin width-full">전송</button>
</u:isLogin>