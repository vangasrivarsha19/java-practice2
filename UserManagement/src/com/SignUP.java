package com;

import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Statement;
import com.util.DBConnection;

public class SignUP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name");
		
		String userName = sc.nextLine();
		
		System.out.println("Enter your password");
		
		String password = sc.nextLine();
		
		Statement statement = DBConnection.getStatement();
		
		//insert into users (user_name,password) values ('varsha','telidhu' );

		try {
		statement.executeUpdate("insert into users(user_name,password) values('" + userName +"', '" + password + "')");
		System.out.println("congrats you have signed up successfully");
		
		}
		catch(SQLException ex) {
		System.out.println("user name already exists ");
	}
		

}
}