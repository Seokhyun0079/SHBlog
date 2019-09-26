$(function () {
    $("#chat_btn").click(function () {
        if($("#message").val()=="") {
            alert("메시지를 입력해주세요");
        }else{
            $.ajax({
                url  : "/chatLog/write.do",
                type : "GET",
                data : {
                    id : $("#id").val(),
                    message : $("#message").val(),
                    count : $("#count").val()
                },
                success : function () {
                    $("#message").val("");
                }
            });
        }
    });
    setInterval(function() {
        $.ajax({
            url  : "/chatLog/list.do",
            type : "GET",
            data : {
                count : $("#count").val()
            },
            success : function (data) {
                console.log(data.count);
                if(data.count > $("#count").val()){
                    $("#chat-box").html("");
                    for(var i = 0; i < data.result.length; i++){
                        $("#chat-box").append('<div style="width: 100%;"><b>'+data.result[i].id+'</b> ' + data.result[i].message+'</div>');
                    }
                    $("#count").val(data.count);
                    $("#chat-box").scrollTop($("#chat-box")[0].scrollHeight);
                }
            }
        });
    }, 300);
    $("#message").keyup(function(e){
        if(e.keyCode == 13)  $('#chat_btn').trigger('click');
    });
});