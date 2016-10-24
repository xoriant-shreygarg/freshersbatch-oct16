package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Jdbc4 {

	public static void main(String[] args) throws Exception {
//		batchUpdates();
		transactions();
	}
	
	public static void transactions() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","root");
//		Statement stmt = con.createStatement();
//		try {
//			con.setAutoCommit(false);
//			stmt.executeUpdate("UPDATE EMP_COPY2 SET NAME = 'ABC100' WHERE ID = 1");
//			stmt.executeUpdate("UPDATE EMP_COPY2 SET NAME = 'ABC200' WHER1 ID = 200");
//			con.commit();
//		}
//		catch(SQLException e) {
//			con.rollback();
//			e.printStackTrace();
//		}
//		finally {
//			con.setAutoCommit(true);
//		}
		PreparedStatement pstmt = con.prepareStatement("UPDATE EMP_COPY2 SET NAME = ? WHERE ID = ?");
//		pstmt.setString(1, "SHREY4");
//		pstmt.setInt(2, 1);
//		System.out.println(""+pstmt.executeUpdate());
		try {
			con.setAutoCommit(false);
			pstmt.setString(1, "SHREY5");
			pstmt.setInt(2, 1);
			pstmt.addBatch();
			pstmt.clearParameters();
			pstmt.setString(1, "ARCHIT5");
			pstmt.setInt(2,2);
			pstmt.addBatch();
			int updates[] = pstmt.executeBatch();
			System.out.println(Arrays.toString(updates));
			con.commit();
		}
		catch(SQLException e) {
			con.rollback();
			e.printStackTrace();
		}
		finally {
			con.setAutoCommit(true);
		}
	}
	
	public static void batchUpdates() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "System", "root");
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate("DELETE FROM EMP_COPY2");
		ResultSet rs = stmt.executeQuery("select * from EMP");
		while(rs.next()){
			stmt.addBatch("INSERT INTO EMP_COPY2(ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO,MANAGER_ID) VALUES ("
					+rs.getInt("ID")+","+
					"'"+rs.getString("NAME")+"',"+
					rs.getDouble("SALARY")+","+
					rs.getDouble("COMMISSION")+","+
					"'"+rs.getString("ROLE")+"',"+
					rs.getInt("DEPT_NO")+","+
					rs.getInt("MANAGER_ID")+
					")");
		}
		int updations[] = stmt.executeBatch();
		System.out.println(Arrays.toString(updations));
	}
	

}

/*
 
The jdbc-spec has the following to say about the return-code of batch-updates:

- 0 or greater — the command was processed successfully and the value is an update count indicating
 the number of rows in the database that were affected by the command’s execution Chapter 14 Batch 
 Updates 121

- Statement.SUCCESS_NO_INFO — the command was processed successfully, but the number of rows 
affected is unknown
Statement.SUCCESS_NO_INFO is defined as being -2, so your result says everything worked fine,
 but you won't get information on the number of updated columns.

The oracle-documentation states:

- For a prepared statement batch, it is not possible to know the number of rows affected in 
the database by each individual statement in the batch. Therefore, all array elements have a
 value of -2. According to the JDBC 2.0 specification, a value of -2 indicates that the operation
  was successful but the number of rows affected is unknown.

- For a generic statement batch, the array contains the actual update counts indicating the
 number of rows affected by each operation. The actual update counts can be provided only in 
 the case of generic statements in the Oracle implementation of standard batching.

- For a callable statement batch, the server always returns the value 1 as the update count,
 irrespective of the number rows affected by each operation.
So it seems if you need the update-counts you can't use PreparedStatements but have to fall
 back to plain Statements.

*/
