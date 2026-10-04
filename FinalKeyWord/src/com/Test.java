package com;

public class Test {
	
	public static void main(String[] args) {
		
		Student st1 = new Student (1, "Varsha","ECE" );
		Student st2 = new Student (1, "Aksh","ECE");
		
		System.out.println(st1.collegeName);
		System.out.println(st2.collegeName);
		System.out.println(st1.name);
		System.out.println(st2.name);
		System.out.println(st1.studentId);
		System.out.println(st2.studentId);
		
		//college name will be final because it cannot change 
		
		
		
		
	}

}
