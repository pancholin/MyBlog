package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblog.entity.Article;
import com.myblog.entity.Comment;

public interface CommentDao {
	/*
	 * 向数据库中增添评论
	 */
	public Response addComment(Comment comment);  
    
	/*
	 * 获取某篇文章的所有评论
	 */
	public List<Comment> getAllCommentByArticleID(int articleID);  
	  	
	/*
	 * 以评论ID为检索获取评论信息
	 */
	public Comment getComment(int id); 
	
	/*
	 * 删除某条评论
	 */
	public Response deleteComment(int id);
	
}
