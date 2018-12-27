package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String userName = "admin";
		String passwd = "admin";
		String query = "select * from student";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, passwd);
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(query);
			while(set.next())
			{
				System.out.println(set.getInt(1)+" : "+set.getString(2));
			}
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
