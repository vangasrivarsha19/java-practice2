package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
         String url = "jdbc:mysql://localhost:3306/jdbc"; //exact data base location
		
		String userName = "root";
		String password = "AB32@prc";
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		String query = "update students set marks = 98 where id = 2";
		String query2 = "Delete from students where id = 1";
		
		Statement statement =connection.createStatement();
		
		statement.executeUpdate(query);	
		System.out.println("updated......");
		
		statement.executeUpdate(query2);
		System.out.println("deleted......");
		
		connection.close();
		statement.close();
		
	}

}
