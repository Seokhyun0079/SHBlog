$(function(){
	$.ajax({	
		url: "/freeboard/comment/list.do",
		type: "GET",
		data: {"articleNo" :  $("#no").val()},
		success: function (data) {
			for(var i = 0; i < data.result.length; i++){
				$("#comment-list").append('<div><b>'+data.result[i].id+'</b> ' + data.result[i].content+'</div>');
			}
			$("#commentNo").val(data.count);
		},
	});
    $("#reply_btn").click(function(){
    	if($("#content").val().trim() === ""){
    		alert("댓글을 입력하세요.");
    		$("#content").val("").focus();
    	}else{
    		$.ajax({
    			url: "/freeboard/comment/write.do",
                type: "GET",
                data: {
                	id : $('#id').val(),
                	articleNo : $("#no").val(),
                    content : $("#content").val(),
                    commentNo : $("#commentNo").val()
                },
                success: function (data) {
//	                console.log(data.result.list.length);
//	                for(var i = 0; i < data.result.list.length; i++){
//    	            	$("#commentList").append('<img src="/SalmonBooks/resource/image/author.png">'+data.result.list[i].writerId +' : '+data.result.list[i].content+'<br>');    
//	                }
//	                $("#count").val( data.result.commentCount);
//                	$("#content").val("");	
                },
    		})
    	}	
    });
});