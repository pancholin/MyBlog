package com.myblog.dbconn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;




public class GenricDao {
	/*
	 * ����sql����
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
			re.setMessage("����ɹ�");
			
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
	 * ����sql����
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
			re.setMessage("���³ɹ�");
		} catch (SQLException e) {
			re.setStateCode(false);
			re.setMessage(e.toString());
			return re;
		}
		cdb.close();
		re.print();
		return re;
	};


	/**�ڲ�������ִ��ɾ�����
	 * @param sql ɾ����� 
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
			re.setMessage("ɾ���ɹ�");
		} catch (SQLException e) {
			re.setStateCode(false);
			re.setMessage(e.toString());
		}
		cdb.close();
		re.print();
		return re;
	};
	
	

}
