package com;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		Integer b = new Integer(15);//deprecated which is not used but not removed
		Integer c = Integer.valueOf(15);//instead use this
		System.out.println(b);
		
		//Auto Boxing
		Integer d = Integer.valueOf(a);//here primitive converted to wrapper
		System.out.println(d);
		
		//Auto unboxing
		Integer e = Integer.valueOf(20);
		int f = e.intValue(); //here wrapper to primitive
		System.out.println(f);
		
		Integer g = 20;//directly we can change automatically
		Integer h = a;
		
		int i = g;
				
		
	}

}
