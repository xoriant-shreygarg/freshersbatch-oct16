package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","root");
		Statement stmt = con.createStatement();
		
		/* -- Using Statement --
		int inserted = stmt.executeUpdate("insert into DEPT values (9,'QA','PUNE')");
		System.out.println("Inserted : "+inserted);
		ResultSet rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
		int updated = stmt.executeUpdate("update DEPT set name = 'Testing' where id = 9");
		System.out.println("Updated : "+updated);
		rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
		int deleted = stmt.executeUpdate("delete from DEPT where id = 9");
		System.out.println("Deleted : "+deleted);
		rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
		*/
		
		
		ResultSet rs =null;
		
		PreparedStatement ps = con.prepareStatement("insert into DEPT values (?,?,?)");
		ps.setInt(1, 12);
		ps.setString(2, "Security");
		ps.setString(3, "Goa");
		int inserted = ps.executeUpdate();
		System.out.println("Inserted : "+inserted);
		rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
		
		PreparedStatement ps_update = con.prepareStatement("update DEPT set location = ? where id = ?");
		ps_update.setInt(2, 12);
		ps_update.setString(1, "Delhi");
		int updated = ps_update.executeUpdate();
		System.out.println("Updated : "+updated);
		rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
		
		PreparedStatement ps_delete = con.prepareStatement("delete from DEPT where id = ?");
		ps_delete.setInt(1, 12);
		int deleted = ps_delete.executeUpdate();
		System.out.println("Deleted : "+deleted);
		rs = stmt.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+"-"+rs.getString("location"));
		}
	}

}
