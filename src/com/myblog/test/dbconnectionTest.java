package com.myblog.test;



import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.myblog.dao.ArticleDaoImpl;
import com.myblog.dao.CommentDaoImpl;
import com.myblog.dao.MessageDaoImpl;
import com.myblog.dao.UserDaoImpl;
import com.myblog.dbconn.ConnDB;
import com.myblog.dbconn.GenricDao;
import com.myblogl.entity.Article;
import com.myblogl.entity.Comment;
import com.myblogl.entity.Message;
import com.myblogl.entity.User;

public class dbconnectionTest {
	public static void main(String []arg){
		ConnDB getConn=new ConnDB();
		getConn.getConnection();
		/*String sql="select * from tb_user";
		getConn.executeUser(sql);
		Timestamp date=new Timestamp(0);
		String commentsql="insert into tb_comment (commentID,articleID,userID,content) "
				+ "values (3,1,\"linpanxue\",\"这篇文章写得不错，值得参考\")";
		
		String articlesql="insert into tb_article (articleID,title,content,classification)"
				+ "values (3,\"如何从百度官网下载文档\",\"就这样咯\",\"android\")";
		
		System.out.println(commentsql);
		GenricDao generic=new GenricDao();
		generic.insert(articlesql);
		generic.insert(commentsql);*/
		
		/*User user=new User();
		user.setUserID("linpanxue");
		user.setEmail("15017354189@163.com");
		user.setPassword("123456");
		UserDaoImpl userDao=new UserDaoImpl();
		userDao.updateUser(user);
		user=userDao.getUser("linpanxue");
		List<User>list=userDao.getAllUser();
		for(int i=0;i<list.size();i++){
			list.get(i).print();
		}*/
		
		/*Article article=new Article();
		article.setArticleID(1);
		article.setTitle("我是林攀学");
		article.setContent("this page not good select * from");
		article.setClassification("android");
		
		ArticleDaoImpl articleDao=new ArticleDaoImpl();
		articleDao.updateArticle(article);
		//articleDao.addArticle(article);
		articleDao.getAllArticle();
		articleDao.getArticle(1);*/
		
		
		/*Comment comment=new Comment();	
		CommentDaoImpl commentDao=new CommentDaoImpl();
		commentDao.getAllCommentByArticleID(1);
		commentDao.getComment(1);
		//commentDao.deleteComment(3);
		comment.setArticleID(1);
		comment.setContent("很不错哦");
		comment.setUserID("linpanxue");
		commentDao.addComment(comment);*/
		
		/*Message message=new Message();
		message.setUserID("linpanxue");
		message.setContent("博主，吃屎去吧");
		MessageDaoImpl messageDao=new MessageDaoImpl();
		messageDao.addMessage(message);
		messageDao.getAllMessage();*/
		
		
		
		
		
		
		
		
	}
}
