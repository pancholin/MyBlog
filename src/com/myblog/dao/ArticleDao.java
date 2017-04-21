package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblog.entity.Article;
import com.myblog.entity.User;

/*
 * 对Article表进行操作
 */
public interface ArticleDao {
	/*
	 * 向数据库中增添文章
	 */
	public Response addArticle(Article article);  
    
	/*
	 * 获取所有文章信息
	 */
	public List<Article> getAllArticle();  
	  
	
	/*
	 * 以文章ID为检索获取文章信息
	 */
	public Article getArticle(int id);  
	
	/*
	 * 更新某个文章信息
	 */
	public Response updateArticle(Article article);

}
