package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblogl.entity.User;


/*
 * userDao对user表进行操作
 */
public interface UserDao {
	
	/*
	 * 向数据库中增添用户
	 */
	public Response addUser(User user);  
    
	/*
	 * 获取所有用户信息
	 */
	public List<User> getAllUser();  
	  
	
	/*
	 * 以用户ID为检索获取用户信息
	 */
	public User getUser(String id);  
	
	/*
	 * 更新某个用户信息
	 */
	public Response updateUser(User user); 
	
}
