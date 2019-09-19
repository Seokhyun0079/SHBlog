$(function(){
	$.ajax({	
		url: "/freeboard/comment/list.do",
		type: "GET",
		data: {"articleNo" :  $("#no").val()},
		success: function (data) {
			for(var i = 0; i < data.result.length; i++){
				$("#comment-list").append('<div><b>'+data.result[i].id+'</b> ' + data.result[i].content+'</div>');
			}
			$("#count").val(data.count);
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
                    count : $("#count").val()
                },
                success: function (data) {
	                for(var i = 0; i < data.result.length; i++){
                        $("#comment-list").append('<div><b>'+data.result[i].id+'</b> ' + data.result[i].content+'</div>');
	                }
	                $("#count").val( data.result.commentCount);
	                $("#content").val("");
                },
    		})
    	}	
    });
});