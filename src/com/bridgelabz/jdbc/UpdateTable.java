package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTable {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String query = "update student set Name='John' where RollNo=102";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, "admin","admin");
			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("updated");
			statement.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
