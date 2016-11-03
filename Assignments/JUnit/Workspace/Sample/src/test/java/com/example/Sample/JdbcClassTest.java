package com.example.Sample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(value = JdbcClass.class)
public class JdbcClassTest {

	@Mock
	public static Connection con;
	@Mock
	public static DriverManager driverManager;
	@Mock
	public static Statement statement;
	@Mock
	public static ResultSet resultSet;

	@BeforeClass
	public static void beforeClass() {
		con = mock(Connection.class);
		driverManager = mock(DriverManager.class);
		statement = mock(Statement.class);
		resultSet = mock(ResultSet.class);
		PowerMockito.mockStatic(DriverManager.class);
		try {
			when(driverManager.getConnection(anyString(), anyString(), anyString())).thenReturn(con);
			when(con.createStatement()).thenReturn(statement);
			when(statement.executeQuery(anyString())).thenReturn(resultSet);
			when(resultSet.next()).thenReturn(true);
			when(resultSet.getString(anyString())).thenReturn("String");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try {
			assertEquals("String", new JdbcClass().getAllEmployees());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}