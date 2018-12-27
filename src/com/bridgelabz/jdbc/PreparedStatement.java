package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStatement {

	public static void main(String[] args) 
	{
		int Rollno = 106;
		String Name = "Shalini";
		String query = "insert into student values(?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "admin");
			java.sql.PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, Rollno); //1 is no or index of question mark
			stmt.setString(2, Name);
			int count = stmt.executeUpdate();
			System.out.println(count+" rows affected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
