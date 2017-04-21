package com.myblog.entity;

import java.util.Date;

public class Message {
	private int messageID; //message的ID
	private String userID;//用户ID
	private String content; //留言的内容
	private Date time; //;留言的时间
	
	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = messageID;
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
		System.out.println("Message:"+messageID+" "+userID+" "+	content+" "+time);
	}
	

}
