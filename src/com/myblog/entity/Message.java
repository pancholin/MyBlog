package com.myblog.entity;

import java.util.Date;

public class Message {
	private int messageID; //message��ID
	private String userID;//�û�ID
	private String content; //���Ե�����
	private Date time; //;���Ե�ʱ��
	
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
