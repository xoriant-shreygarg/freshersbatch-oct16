package com.sample;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import com.sample.DatabaseOpr;
import com.sample.Employee;

import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DriverManager.class, DatabaseOpr.class})
public class DatabaseOprTest {

	@Test
	public void findAllEmployees() throws Exception {
		Connection con = mock(Connection.class);
		Statement stmt = mock(Statement.class);
		ResultSet rs = mock(ResultSet.class);

		PowerMockito.mockStatic(DriverManager.class);
		when(DriverManager.getConnection(anyString(), anyString(), anyString())).thenReturn(con);
		
		when(con.createStatement()).thenReturn(stmt);
		when(stmt.executeQuery(anyString())).thenReturn(rs);
		DatabaseOpr databaseOpr = new DatabaseOpr();
		List<Employee> empList = databaseOpr.getAllEmployees();
		System.out.println(empList);
		assertEquals(new ArrayList<Employee>(), empList);
	}
}
