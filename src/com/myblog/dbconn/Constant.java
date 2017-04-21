package com.myblog.dbconn;

public class Constant {
	
	public  final String DB="myblog";//在MySQL中定义的数据库名字
	public  final String USER_TABLE="tb_user";     
	public  final String ARTICLE_TABLE="tb_article";
	public  final String MESSAGE_TABLE="tb_message";
	public  final String COMMENT_TABLE="tb_comment";
	
	public  final String JDBC_DRIVER="com.mysql.jdbc.Driver";//驱动器
	public  final String url="jdbc:mysql://localhost:3306/"+DB+"?useUnicode=true&characterEncoding=utf-8&useSSL=false";//地址
	
	public  final String DB_USER_NAME="root";//MYSQL中配置的用户名
	public  final String DB_PASSWORD="linpanxue";//MYSQL中配置的用户登录密码
	
	
	

}
