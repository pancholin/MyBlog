package com.myblog.entity;

import java.util.Date;

public class Comment {
	
	private int commentID;//���۵�ID
	private int articleID;//���µ�ID
	private String userID;//�û�ID
	private String content;//��������
	private Date time; //����ʱ��
	
	
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public void print(){
		System.out.println("Comment:"+commentID+" "+articleID+" "+userID+"��"+content+" "+time);
	}
	
}
