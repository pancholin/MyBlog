package com.myblog.entity;

public class User {
	private String userID;     //�û����ǳ� �ַ���30λ
	private String email;  //�û�����  �ַ���30λ
	private String password; //�û����� �ַ���20λ
		
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
