package com.my.blog.chat.controller;

import com.my.blog.chat.service.ChatLogService;
import com.my.blog.chat.vo.ChatLog;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ChatController {
    @Autowired
    ChatLogService chatLogService;
    @RequestMapping("/chatLog/write.do")
    public void  insertChatLog(ChatLog vo, HttpServletResponse res){
        System.out.println("[ChatController] /chatLog/insert.do -> insertChatLog()");
        chatLogService.insertChatLog(vo);
        JSONObject obj = new JSONObject();
        obj.put("result", true);
        res.setContentType("application/x-json; charset=UTF-8");
        try{
            res.getWriter().print(obj);
        }catch(IOException e){}
        //여기서부터 구현 다시 해야함
    }
    @RequestMapping("/chatLog/list.do")
    public void getChatLogList(ChatLog vo, HttpServletResponse res){
        JSONObject obj = new JSONObject();
        obj.put("result", chatLogService.getChatLogList(vo));
        obj.put("count", chatLogService.getCount());
        res.setContentType("application/x-json; charset=UTF-8");
        try{
            res.getWriter().print(obj);
        }catch(IOException e){}
    }
}
