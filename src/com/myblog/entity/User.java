package com.myblog.entity;

public class User {
	private String userID;     //用户的昵称 字符串30位
	private String email;  //用户邮箱  字符串30位
	private String password; //用户密码 字符串20位
		
	/*
	 * get and set function
	 */	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
	public void print(){
		System.out.println("User:"+userID+" "+password+" "+email);
	}
	
}
