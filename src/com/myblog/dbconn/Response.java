package com.myblog.dbconn;

public class Response {
	private boolean stateCode;
	private String message;
	
	public boolean isStateCode() {
		return stateCode;
	}
	public void setStateCode(boolean stateCode) {
		this.stateCode = stateCode;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void print(){
		System.out.println("Response:"+stateCode+" "+message);
	}

	
}
