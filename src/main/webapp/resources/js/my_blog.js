$(function(){
	$.ajax({	
		url: "/freeboard/article/best.do",
		type: "GET",
		data: {},
		success: function (data) {
			for(var i = 0; i < data.result.length; i++){
				$("#freeboard-best").append('<div><a href="/freeboard/article/read.do?articleNo='+data.result[i].articleNo+'">'+data.result[i].title+'</a></div>');
			}
		},
	});
	$.ajax({
		url  : "/freeboard/article/list.do",
		type : "GET",
		data : {"page" : $.urlParam('page')},
		success : function(data){
			console.log(data.result);
			for(var i = 0; i < data.result.length; i++){
				$("#freeboard-list").append('<div><a href="/freeboard/article/read.do?articleNo='+data.result[i].articleNo+'">'+data.result[i].title+'</a></div>');
			}
		}
	});
});

$.urlParam = function(name){
    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
    if (results==null){
       return 0;
    }
    else{
       return results[1] || 0;
    }
}