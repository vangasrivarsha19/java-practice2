package com;

public class Test3 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try {
		if(num2 == 0) {
			
			throw new ArithmeticException();
		}
		}
		catch(ArithmeticException ex) {
			System.out.println("entered catch");
		}
		System.out.println("hiii");
		
		
		int res = num1/num2;
		System.out.println(res);
	}

}
