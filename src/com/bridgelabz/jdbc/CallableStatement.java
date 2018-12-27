package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String userName = "admin";
		String password = "admin";
		String query = "{call getAllData(?,?)}";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			java.sql.CallableStatement callstmt =  con.prepareCall(query);
			callstmt.setInt(1, 106);
			callstmt.setString(2,"John");
			callstmt.execute();
			System.out.println("Success");
			callstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
