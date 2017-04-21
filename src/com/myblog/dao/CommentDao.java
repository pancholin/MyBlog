package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblogl.entity.Article;
import com.myblogl.entity.Comment;

public interface CommentDao {
	/*
	 * �����ݿ�����������
	 */
	public Response addComment(Comment comment);  
    
	/*
	 * ��ȡĳƪ���µ���������
	 */
	public List<Comment> getAllCommentByArticleID(int articleID);  
	  	
	/*
	 * ������IDΪ������ȡ������Ϣ
	 */
	public Comment getComment(int id); 
	
	/*
	 * ɾ��ĳ������
	 */
	public Response deleteComment(int id);
	
}