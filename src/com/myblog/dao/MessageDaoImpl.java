package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.ConnDB;
import com.myblog.dbconn.Constant;
import com.myblog.dbconn.GenricDao;
import com.myblog.dbconn.Response;
import com.myblogl.entity.Message;
import com.myblogl.entity.Message;

public class MessageDaoImpl implements MessageDao{

	@Override
	public Response addMessage(Message message) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="insert into "+constant.MESSAGE_TABLE+" (userID,content) values"
				+ "(\""+message.getUserID()+"\",\""+message.getContent()+"\")";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
	}

	@Override
	public List<Message> getAllMessage() {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.MESSAGE_TABLE;
		ConnDB connDB=new ConnDB();
		List<Message>list=connDB.executeMessage(sql);
		return list;
	}

}
