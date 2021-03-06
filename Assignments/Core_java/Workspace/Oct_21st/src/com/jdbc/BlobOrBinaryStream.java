package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BlobOrBinaryStream {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","root");
		
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate("CREATE TABLE STUDENT( ROLL_NO INT, NAME VARCHAR2(20), PHOTOGRAPH BLOB)");
		
//		PreparedStatement pstmt = 
//				con.prepareStatement("INSERT INTO STUDENT VALUES(?, ?, ?)");
//		pstmt.setInt(1,  1);
//		pstmt.setString(2,  "Shrey");
//		
//		File file = new File("D:/FreshersTraining/freshersbatch-oct16/Assignments/Core_java/Workspace/Oct_21st/src/com/jdbc/photo.jpg");
//		FileInputStream fis = new FileInputStream(file);
//		pstmt.setBinaryStream(3, fis, file.length());
//		int x = pstmt.executeUpdate();
//		
//		System.out.println(""+x);
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from STUDENT");
		while(rs.next()){
//			Blob photo = rs.getBlob("photograph");
			
			System.out.println(rs.getInt("roll_no")+"-"+rs.getString("name")+"-"+rs.getBinaryStream("photograph"));
		}
	}

}
