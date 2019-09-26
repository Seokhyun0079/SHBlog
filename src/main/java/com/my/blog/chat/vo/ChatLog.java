package com.my.blog.chat.vo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ChatLog {
    @Id
    @GeneratedValue
    private int chatNo;
    private String id;
    private String message;
    private int count;

    public int getChatNo() {
        return chatNo;
    }

    public void setChatNo(int chatNo) {
        this.chatNo = chatNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChatLog{" +
                "chatNo=" + chatNo +
                ", id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
