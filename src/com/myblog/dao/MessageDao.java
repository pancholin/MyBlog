package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblog.entity.Message;

public interface MessageDao {
	
	/*
	 * 向数据库中增添文章
	 */
	public Response addMessage(Message message);  
    
	/*
	 * 获取所有文章信息
	 */
	public List<Message> getAllMessage();  
	  

}
