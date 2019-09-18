package com.my.blog.freeboard.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "freeboard_article")
public class FreeboardArticle {
	@Id
	@GeneratedValue
	private int articleNo;
	private String id;
	private int recommend;
	private int readCount;
	private String title;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate = new Date();
	@Temporal(TemporalType.TIMESTAMP)
	private Date modDate = new Date();
	@Transient
	private int page;
	@Transient
	private int start;

	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getId() {
		return id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "FreeboardArticle [articleNo=" + articleNo + ", id=" + id + ", recommend=" + recommend + ", readCount="
				+ readCount + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", modDate="
				+ modDate + ", page=" + page + ", start=" + start + "]";
	}
	
}
