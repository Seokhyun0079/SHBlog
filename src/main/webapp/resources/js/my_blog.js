$(function(){
	$.ajax({	
		url: "/freeboard/article/best.do",
		type: "GET",
		data: {},
		success: function (data) {
			for(var i = 0; i < data.result.length; i++){
				$("#freeboard-best").append('<div><a href="/freeboard/article/read.do?articleNo='+data.result[i].articleNo+'">'+data.result[i].title+' <b style="color : crimson">'+data.result[i].count+'</b></a></div>');
			}
		},
	});
    $.ajax({
        url  : "/freeboard/article/list.do",
        type : "GET",
        data : {
            page : $("#page").val(),
            searchCondition : $("#searchCondition").val(),
            searchKeyword : $("#searchKeyword").val()
        },
        success : function (data) {
            drawFreeboard(data);
        }
    });
    $("#searchBtn").click(function () {
        $.ajax({
            url  : "/freeboard/article/list.do",
            type : "GET",
            data : {
                page : $("#page").val(),
                searchCondition : $("#searchCondition").val(),
                searchKeyword : $("#searchKeyword").val()
            },
            success : function (data) {
                drawFreeboard(data);
            }
        });
    });
});

var drawFreeboard = function(data){
    $("#freeboard-list").html("");
    for(var i = 0; i < data.result.length; i++){
        $("#freeboard-list").append('<div><a href="/freeboard/article/read.do?articleNo='+data.result[i].articleNo+'">'+data.result[i].title+' <b style="color : crimson">'+data.result[i].count+'</b></a></div>');
    }
    $("#freeboard-pagenum").html("");
    for(var i = 1; i <= data.maxPage; i++){
        if(i!=(parseInt($("#page").val())+1))$("#freeboard-pagenum").append('<span class="pagenum" onclick="pageonclick('+(i-1)+')">  '+ i +' </span>');
        else $("#freeboard-pagenum").append('<h3 class="pagenum" onclick="pageonclick('+(i-1)+')">  '+ i +' </h3>');
    }
};

$.urlParam = function(name){
    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
    if (results==null){
        return 0;
    }
    else{
        return results[1] || 0;
    }
};

function pageonclick(i){
	$("#page").val(i);
    $.ajax({
        url  : "/freeboard/article/list.do",
        type : "GET",
        data : {
            page : $("#page").val(),
            searchCondition : $("#searchCondition").val(),
            searchKeyword : $("#searchKeyword").val()
        },
        success : function(data){
            $("#freeboard-list").html("");
            for(var i = 0; i < data.result.length; i++){
                $("#freeboard-list").append('<div><a href="/freeboard/article/read.do?articleNo='+data.result[i].articleNo+'">'+data.result[i].title+' <b style="color : crimson">'+data.result[i].count+'</b></a></div>');
            }
            $("#freeboard-pagenum").html("");
            for(var i = 1; i <= data.maxPage; i++){
                if(i!=(parseInt($("#page").val())+1))$("#freeboard-pagenum").append('<span class="pagenum" onclick="pageonclick('+(i-1)+')">  '+ i +' </span>');
                else $("#freeboard-pagenum").append('<h3  class="pagenum" onclick="pageonclick('+(i-1)+')">  '+ i +' </h3>');
            }
        }
    });
}
