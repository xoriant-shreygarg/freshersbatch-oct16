package com.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcClass {

	// public int getRowCount(Connection con) {
	// try {
	// Statement stmt = con.createStatement();
	// ResultSet rs = stmt.executeQuery("select * from emp");
	// int count = 0;
	// while (rs.next())
	// count++;
	// stmt.close();
	// rs.close();
	// return count;
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return -1;
	// }

	public List<Employee> getAllEmployees() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection dbcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		Statement stmt = dbcon.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		List<Employee> empList = new ArrayList<Employee>();
		while (rs.next()) {
			Employee e = new Employee(rs.getInt("ID"), rs.getString("NAME"), rs.getDouble("SALARY"));
			empList.add(e);
		}
		return empList;
	}

	public static void main(String args[]) throws Exception {
		JdbcClass dbo = new JdbcClass();
		List<Employee> empList = dbo.getAllEmployees();
		System.out.println(empList);

	}

}