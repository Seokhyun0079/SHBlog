package com.my.blog.chat.service;

import com.my.blog.chat.dao.ChatLogDAO;
import com.my.blog.chat.vo.ChatLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatLogService {
    @Autowired
    private ChatLogDAO chatLogDAO;

    public void insertChatLog(ChatLog vo){
        chatLogDAO.insertChatLog(vo);
        chatLogDAO.commit();
    }
    public List<ChatLog> getChatLogList(ChatLog vo){
        return chatLogDAO.getChatLogList(vo);
    }
    public int getCount(){
        return chatLogDAO.getCount();
    }

}
