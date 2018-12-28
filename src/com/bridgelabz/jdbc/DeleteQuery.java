package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteQuery 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String userName = "admin";
		String password = "admin";
		String query = "delete from student where Rollno=106";
		try
		{
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.executeUpdate();
			System.out.println("record deleted");
			prepareStatement.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
