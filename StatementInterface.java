package com.jdbc;
import java.sql.*;
import java.sql.ResultSet;

class Student                                               
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","admin");
			Statement stat =cnn.createStatement();
			ResultSet res  =stat.executeQuery("select*from student");

			while (res.next())
			{
				System.out.println (res.getInt("roll_no")+" "+res.getString("name")+" "+res.getInt("age")+" "+res.getString("city")+" ");

			}
		}
		catch (ClassNotFoundException e1)
		{
			e1.printStackTrace();

		}
		catch(SQLException e2)
		{
			e2.printStackTrace();
		}
	}
}
