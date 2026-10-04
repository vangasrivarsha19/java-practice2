package com;

public class Jio implements Trai{

	@Override
	public void calling() {
		System.out.println("Freeeeeeeeee");
		
	}

	@Override
	public void data() {
		System.out.println("5G Data");
		
	}

	@Override
	public void sms() {
		System.out.println("100 sms per day");
		
		
	}
	public void roaming() {                         //we can give extra features but following parent rules is mandatory 
		
		System.out.println("International Roaming");
	}

	public void ott() {
		
		System.out.println("Hotstar..");
	}
}
