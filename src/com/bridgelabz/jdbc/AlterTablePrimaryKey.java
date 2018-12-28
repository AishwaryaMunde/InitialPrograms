package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AlterTablePrimaryKey
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String query = "alter table student add primary key(Rollno)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, "admin", "admin");
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Altered");
			statement.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
