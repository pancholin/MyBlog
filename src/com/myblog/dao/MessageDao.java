package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblog.entity.Message;

public interface MessageDao {
	
	/*
	 * �����ݿ�����������
	 */
	public Response addMessage(Message message);  
    
	/*
	 * ��ȡ����������Ϣ
	 */
	public List<Message> getAllMessage();  
	  

}
