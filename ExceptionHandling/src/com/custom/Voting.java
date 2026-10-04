package com.custom;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		int age =sc.nextInt();
		
		try {
		
		if(age>18) {
			System.out.println("eligible to vote");
		}else {
			throw new InvalidAgeException("Age below 18");
		}
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
