package com.myblogl.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.xml.crypto.Data;

public class Article {
	private int articleID;//���µ�ID
	private String title; //���µı���
	private String content;//���µ�����
	private String classification;//���µ����
	private Timestamp time; //����ʱ��

	/*
	 * get and set function
	 */
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
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
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	public void print(){
		System.out.println("Article:"+articleID+" "+title+" "+content+"��"+classification+" "+time);
	}
	
}
