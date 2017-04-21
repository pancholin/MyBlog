package com.myblog.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myblog.entity.Article;
import com.myblog.entity.Comment;
import com.myblog.entity.Message;
import com.myblog.entity.User;





public class ConnDB {
	private Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	
	/*
	 * 获取数据库连接
	 * @return Connection
	 */
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据驱动加载成功");
			String url="jdbc:mysql://localhost:3306/myblog";
			String user="root";
			String password="linpanxue";
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("已经成功与mysql数据库建立连接");			
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	/**关闭所有连接*/
	/**将连接全部关闭*/
	public void close(){
		
			try {
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
	
	
	/**执行对Article表查询语句
	 * @return List<User>
	*/
	public List<Article>executeArticle(String sql){
		List<Article>list=new ArrayList<Article>();
		Connection con=getConnection();
		if(con!=null){
			try {
				st=con.createStatement();
				rs=st.executeQuery(sql);
				while(rs.next()){
				Article article=new Article();
				article.setArticleID(rs.getInt(1));
				article.setTitle(rs.getString(2));
				article.setContent(rs.getString(3));
				article.setClassification(rs.getString(4));
				article.setTime(rs.getTimestamp(5));
				article.print();
				list.add(article);};
		    	} catch (SQLException e) 
				{
		    	// TODO 自动生成的 catch 块
		    	e.printStackTrace();}
		    	return list;
				}
		else{
			return null;
		}	
	}
	
	/**执行对Comment表查询语句
	 * @return List<User>
	*/
	public List<Comment>executeComment(String sql){
		List<Comment>list=new ArrayList<Comment>();
		Connection con=getConnection();
		if(con!=null){
			try {
				st=con.createStatement();
				rs=st.executeQuery(sql);
				while(rs.next()){
				Comment comment=new Comment();
				comment.setCommentID(rs.getInt(1));				
				comment.setArticleID(rs.getInt(2));
				comment.setUserID(rs.getString(3));
				comment.setContent(rs.getString(4));
				comment.setTime(rs.getDate(5));
				comment.print();
				list.add(comment);};
		    	} catch (SQLException e) 
				{
		    	// TODO 自动生成的 catch 块
		    	e.printStackTrace();}
		    	return list;
				}
		else{
			return null;
		}	
	}
	
	/**执行对表查询语句
	 * @return List<Message>
	*/
	public List<Message>executeMessage(String sql){
		List<Message>list=new ArrayList<Message>();
		Connection con=getConnection();
		if(con!=null){
			try {
				st=con.createStatement();
				rs=st.executeQuery(sql);
				while(rs.next()){
				Message message=new Message();
				message.setMessageID(rs.getInt(1));
				message.setUserID(rs.getString(2));
				message.setContent(rs.getString(3));
				message.setTime(rs.getDate(4));
				message.print();
				list.add(message);};
		    	} catch (SQLException e) 
				{
		    	// TODO 自动生成的 catch 块
		    	e.printStackTrace();}
		    	return list;
				}
		else{
			return null;
		}	
	}
	
	/**执行对User表查询语句
	 * @return List<User>
	*/
	public List<User>executeUser(String sql){
		List<User>list=new ArrayList<User>();
		Connection con=getConnection();
		if(con!=null){
			try {
				st=con.createStatement();
				rs=st.executeQuery(sql);
				while(rs.next()){
				User user=new User();
				user.setUserID(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.print();
				list.add(user);};
		    	} catch (SQLException e) 
				{
		    	// TODO 自动生成的 catch 块
		    	e.printStackTrace();}
		    	return list;
				}
		else{
			return null;
		}	
	}
	

	
	

}
