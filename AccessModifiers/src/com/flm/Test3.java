package com.flm;

import com.Test;

public class Test3 {
	public static void main(String[] args) {
		
		
		Test t3 = new Test();
	
		System.out.println(t3.a);
		t3.hi();
		
		
		//System.out.println(t2.c); access only same package
		//t2.bye();
		
		//if it is  public it can access any class or package
		//if it is private access within class
		//if it is protected access within package but we can also access for inheritance relationship like if our class is child we can access from the parent class
	}

}
