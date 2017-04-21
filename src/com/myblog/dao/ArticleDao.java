package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.Response;
import com.myblogl.entity.Article;
import com.myblogl.entity.User;

/*
 * ��Article����в���
 */
public interface ArticleDao {
	/*
	 * �����ݿ�����������
	 */
	public Response addArticle(Article article);  
    
	/*
	 * ��ȡ����������Ϣ
	 */
	public List<Article> getAllArticle();  
	  
	
	/*
	 * ������IDΪ������ȡ������Ϣ
	 */
	public Article getArticle(int id);  
	
	/*
	 * ����ĳ��������Ϣ
	 */
	public Response updateArticle(Article article);

}
