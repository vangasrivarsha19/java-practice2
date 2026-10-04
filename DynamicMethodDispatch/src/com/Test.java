package com;

public class Test {
	
	public static void main(String[] args) {
		
		Sim sim = new Airtel();
		Sim sim2 = new Jio();
		
		System.out.println(sim.a);
		//System.out.println(sim.b); it will not access child class reference
		//here the output comes only from parent not child
		
		sim.calling();//method value only comes from child class when its override if its not override we cannot access
		sim2.calling();
	}

}
