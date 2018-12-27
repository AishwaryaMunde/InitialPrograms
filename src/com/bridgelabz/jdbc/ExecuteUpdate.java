package com.bridgelabz.jdbc;
import java.sql.*;
public class ExecuteUpdate {

	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String userName = "admin";
		String password = "admin";
		int Rollno = 104;
		String Name = "Pravin";
		String query = "insert into student values("+Rollno+ ",'"+Name+ "')";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count+" rows affected");
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


/*Class.forName("com.mysql.jdbc.Driver");		
			Connection connection = DriverManager .getConnection(url, userName, password);
			//Statement statement = connection.createStatement();
			Statement preparestmt =connection.createStatement();  
			//ResultSet resultSet = statement.executeQuery("select * from student");
			int count = preparestmt.executeUpdate(query);
//			while(resultSet.next())
//			{
//				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
//			}
//			
			System.out.println(count+" rows affected");
			preparestmt.close();
			connection.close();*/
