package com.myblog.dbconn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;




public class GenricDao {
	/*
	 * 插入sql操作
	 * @return Response
	 */
	public Response insert(String sql){
		Response re=new Response();
		ConnDB cdb=new ConnDB();
		Connection con=cdb.getConnection();
		try {
			Statement st=con.createStatement();
			st.execute(sql);
			re.setStateCode(true);		
			re.setMessage("插入成功");
			
		} catch (SQLException e) {
			e.printStackTrace();
			re.setStateCode(false);
			re.setMessage(e.toString());
			return re;			
		}
			cdb.close();
			re.print();
			return re;		
	}
	
	/*
	 * 更新sql操作
	 * @return Response
	 */
	public Response update(String sql){
		Response re=new Response();
		ConnDB cdb=new ConnDB();
		Connection con=cdb.getConnection();
		try {
			Statement st=con.createStatement();
			st.execute(sql);
			re.setStateCode(true);
			re.setMessage("更新成功");
		} catch (SQLException e) {
			re.setStateCode(false);
			re.setMessage(e.toString());
			return re;
		}
		cdb.close();
		re.print();
		return re;
	};


	/**内部函数，执行删除语句
	 * @param sql 删除语句 
	 * @return List<Score>
	 * */
	public Response delete(String sql){		
		Response re=new Response();
		ConnDB cdb=new ConnDB();
		Connection con=cdb.getConnection();	
		try {
			Statement st=con.createStatement();
			st.execute(sql);
			re.setStateCode(true);
			re.setMessage("删除成功");
		} catch (SQLException e) {
			re.setStateCode(false);
			re.setMessage(e.toString());
		}
		cdb.close();
		re.print();
		return re;
	};
	
	

}
