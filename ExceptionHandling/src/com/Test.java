package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			
		
		sc = new Scanner(System.in);//constructor input stream parameter
		
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		 int num2 = sc.nextInt();
		 
		 System.out.println(num1/num2);
	}
		
		//catch(Exception ex) {
		//System.out.println(ex.getMessage()); // -> it will print the exact message from exception based on exception message will also change
			//System.out.println("Do not Divide By Zero");
		catch(InputMismatchException ex) {
			System.out.println("only integer number allowed");
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bound");
		}
		
		catch(ArithmeticException ex) {
			System.out.println("donot divide by zero");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Entered finally");
			sc.close();
		}
		
		
		System.out.println("heyy");
		System.out.println("bye");
		
}
}
