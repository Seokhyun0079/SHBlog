package com.my.blog.freeboard.vo;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class FreeboardComment {
	@Id
	private int articleNo;
	@Id
	private int commentNo;
	private String id;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate = new Date();
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "FreeboardComment [articleNo=" + articleNo + ", commentNo=" + commentNo + ", id=" + id + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
	
	
	
}
