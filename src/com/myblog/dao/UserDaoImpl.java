package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.ConnDB;
import com.myblog.dbconn.Constant;
import com.myblog.dbconn.GenricDao;
import com.myblog.dbconn.Response;
import com.myblogl.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public Response addUser(User user) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="insert into "+constant.USER_TABLE+" (userID,password,email) values"
				+ "(\""+user.getUserID()+"\",\""+user.getPassword()+"\",\""+user.getEmail()+"\")";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.USER_TABLE;
		ConnDB connDB=new ConnDB();
		List<User>list=connDB.executeUser(sql);
		return list;
	}

	
	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.USER_TABLE+" where userID= \""+id+"\"";
		ConnDB connDB=new ConnDB();
		List<User>list=connDB.executeUser(sql);
		if(list.size()>0){
			return list.get(0);
		}
		else return null;
	}

	@Override
	public Response updateUser(User user) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="update "+constant.USER_TABLE+" "
				+ "set password= \""+user.getPassword()+"\",email=\""+user.getEmail()+"\" where userID=\""+user.getUserID()+"\"";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
	}

	
	

}
