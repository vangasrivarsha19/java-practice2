package com;

public class Test {
	
	public int a;
	private int b;
	protected int c;
	
	int d;
	
	public Test() {
		
		
	}
	private Test(int a , int b) { //(only can access in this class or package cannot access in other class or package)
		
		this.a = a;
		this.b = b;
	}
	public void hi() {
		
		System.out.println("hi....");
		
		
	}
	
	private void  party() {
		System.out.println("private party....");
		
	}
	
	protected void bye() {
		
		System.out.println("protected method...");
	}
	
	void dummy() {
		
		System.out.println("dummy");
	}
	
	Test(String input){
		
	}
	

	public static void main(String[] args) {
		
		Test t = new Test(10,5);
		System.out.println(t.a);//variable printing
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
		t.hi();//calling method
		t.party();
		t.bye();
		t.dummy();
	}
}

class Dummy{
	

}