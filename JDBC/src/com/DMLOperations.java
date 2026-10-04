package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Register a Driver
		System.out.println("starting to register a driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver");//driver is the class name com.mysql.cj.jdbc.is the package name
		
		System.out.println("Driver registered");// gave sql connection by downloading sql connector
		
		
		
		//establish a connection
		
		String url = "jdbc:mysql://localhost:3306/jdbc"; //exact data base location
		
		String userName = "root";
		String password = "AB32@prc";
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		System.out.println("Connection Established..");
		
		
		
		//prepare sql theory
		
		String insertQuery = "insert into students values(3,'akshitha',99)";
		
		
		
		//create a statement
		
		Statement statement = connection.createStatement();
		
		
		
		//execute a statement
		
		statement.executeUpdate(insertQuery);
		
		
		
		//close the resources
		
		connection.close(); //not mandatory
		statement.close();
		
		System.out.println("Inserted Data");
		
	}

}
