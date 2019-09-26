package com.my.blog.chat.dao;

import com.my.blog.chat.vo.ChatLog;
import com.my.blog.util.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatLogDAO {
    private SqlSession mybatis;
    public ChatLogDAO(){
        this.mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
    }

    public void insertChatLog(ChatLog vo){
        mybatis.insert("ChatLogDAO.insertChatLog", vo);
    }

    public List<ChatLog> getChatLogList(ChatLog vo){
        return mybatis.selectList("ChatLogDAO.getChatLogList", vo);
    }
    public int getCount(){
        return (Integer)mybatis.selectOne("ChatLogDAO.getCount");
    }
    public void commit(){
        mybatis.commit();
    }

}
