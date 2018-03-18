package com.zs.t2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Util {
	public static Connection getConnection() throws SQLException{
		Connection conn=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String username="scott";
			String password="tiger";
			conn=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public static void close(Connection conn,PreparedStatement ps) {
		// TODO Auto-generated method stub
		
	}
}