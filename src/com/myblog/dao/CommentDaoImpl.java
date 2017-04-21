package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.ConnDB;
import com.myblog.dbconn.Constant;
import com.myblog.dbconn.GenricDao;
import com.myblog.dbconn.Response;
import com.myblogl.entity.Comment;


public class CommentDaoImpl implements CommentDao{

	@Override
	public Response addComment(Comment comment) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="insert into "+constant.COMMENT_TABLE+" (articleID,userID,content) values"
				+ "("+comment.getArticleID()+",\""+comment.getUserID()+"\",\""+comment.getContent()+"\")";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
	}

	@Override
	public List<Comment> getAllCommentByArticleID(int articleID) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.COMMENT_TABLE+" where articleID= "+articleID;
		ConnDB connDB=new ConnDB();
		List<Comment>list=connDB.executeComment(sql);
		return list;
	}

	@Override
	public Comment getComment(int id) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.COMMENT_TABLE+" where commentID= "+id;
		ConnDB connDB=new ConnDB();
		List<Comment>list=connDB.executeComment(sql);
		if(list.size()>0){
			return list.get(0);
		}
		else return null;
	}

	@Override
	public Response deleteComment(int id) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="delete from "+constant.COMMENT_TABLE+" where commentID="+id;
		GenricDao generic=new GenricDao();
		Response res=generic.delete(sql);
		return res;
	}

}
