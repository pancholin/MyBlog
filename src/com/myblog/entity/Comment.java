package com.myblog.entity;

import java.util.Date;

public class Comment {
	
	private int commentID;//评论的ID
	private int articleID;//文章的ID
	private String userID;//用户ID
	private String content;//评论内容
	private Date time; //评论时间
	
	
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
		System.out.println("Comment:"+commentID+" "+articleID+" "+userID+"　"+content+" "+time);
	}
	
}
