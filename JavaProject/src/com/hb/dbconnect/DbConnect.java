package com.hb.dbconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnect {
    public static boolean getConnection() throws SQLException     
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hotelbooking", "root", "1919");			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return true;
	}
}
