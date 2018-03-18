package com.zs.t2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.zs.t2.bean.Dept;
import com.zs.t2.util.Util;

public class DeptTest {
	Connection conn=null;
	PreparedStatement ps=null;
	String sql="insert into t_Dept"
			+ "(did,name,manager,tel,master,)values(?,?,?,?,?)";
	@Test
	public void test() throws SQLException {
		Dept dept = new Dept();
		ps=conn.prepareStatement(sql);
		ps.setInt(1, dept.getDid());
		ps.setString(2,dept.getName());
		ps.setInt(3, dept.getManager());
		ps.setString(4, dept.getTel());
		ps.setInt(5,dept.getMaster());
		try {
			conn=Util.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			Util.close(conn, ps);
		}
		System.out.println(dept.toString());
	}
}
