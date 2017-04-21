package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblogl.entity.User;


/*
 * userDao��user����в���
 */
public interface UserDao {
	
	/*
	 * �����ݿ��������û�
	 */
	public Response addUser(User user);  
    
	/*
	 * ��ȡ�����û���Ϣ
	 */
	public List<User> getAllUser();  
	  
	
	/*
	 * ���û�IDΪ������ȡ�û���Ϣ
	 */
	public User getUser(String id);  
	
	/*
	 * ����ĳ���û���Ϣ
	 */
	public Response updateUser(User user); 
	
}
