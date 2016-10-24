package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","root");
		Statement stmt = con.createStatement();
		
//		int x = stmt.executeUpdate("CREATE TABLE EMP_COPY AS (SELECT * FROM EMP)");
//		int x = stmt.executeUpdate("INSERT INTO EMP_COPY (SELECT * FROM EMP)");
		
		ResultSet rs = stmt.executeQuery("select * from EMP_COPY");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getDouble("salary")
			+"-"+rs.getDouble("commission")+"-"+rs.getString("role")+"-"+rs.getInt("dept_no"));
		}
		
	}

}
