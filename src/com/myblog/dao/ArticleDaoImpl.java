package com.myblog.dao;

import java.util.List;

import com.myblog.dbconn.ConnDB;
import com.myblog.dbconn.Constant;
import com.myblog.dbconn.GenricDao;
import com.myblog.dbconn.Response;
import com.myblog.entity.Article;

public class ArticleDaoImpl implements ArticleDao{

	@Override
	public Response addArticle(Article article) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="insert into "+constant.ARTICLE_TABLE+" (title,content,classification) values"
				+ "(\""+article.getTitle()+"\",\""+article.getContent()+"\",\""+article.getClassification()+"\")";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
		
	}

	@Override
	public List<Article> getAllArticle() {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.ARTICLE_TABLE;
		ConnDB connDB=new ConnDB();
		List<Article>list=connDB.executeArticle(sql);
		return list;
	}

	@Override
	public Article getArticle(int id) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="select * from "+constant.ARTICLE_TABLE+" where articleID= "+id;
		ConnDB connDB=new ConnDB();
		List<Article>list=connDB.executeArticle(sql);
		if(list.size()>0){
			return list.get(0);
		}
		else return null;
	}

	@Override
	public Response updateArticle(Article article) {
		// TODO Auto-generated method stub
		Constant constant=new Constant();
		String sql="update "+constant.ARTICLE_TABLE+" "
				+ "set title= \""+article.getTitle()+"\",content=\""+article.getContent()+"\",classification=\""+article.getClassification()+"\" where articleID=\""+article.getArticleID()+"\"";
		GenricDao generic=new GenricDao();
		Response res=generic.insert(sql);
		return res;
	}

}
