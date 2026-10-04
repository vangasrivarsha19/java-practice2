package com;

public class Test2 {
	
	static Integer b ;
	static int c;
	
	public static void main(String[] args) {
		
		String s = "123";
		System.out.println(s + 1);
		
		int num = Integer.parseInt(s);
		System.out.println(num + 1);//string converted to integer
		
		/*String s2 = "FLM";
		int num2 = Integer.parseInt(s2);//should be in number format
		System.out.println(num2);*/
		
		//it accepts string gives int
		
		int a = 150;
		String num3 = String.valueOf(a);//converted int to string
		System.out.println(a+1);
		System.out.println(num3 + 1);
		
		//valueofmethod -> integer to string
		//parse -> string to integer( should be assigned number )
		
		Character c1 = new Character('A');
		Character c2 = 'A';
		                              //helper methods
		System.out.println(Character.isLetter(c2));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('B'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('B'));
		
		System.out.println(Test2.b);
		System.out.println(Test2.c);
		
		
		
		
	}
	
	

}
