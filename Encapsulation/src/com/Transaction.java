package com;

public class Transaction {
	public static void main(String[] args) {
	
	BankAccount bankAcc1 = new BankAccount(1234, "Srivarsha", "FBINI20", "hyd", 19);
	
	/*long accNum = bankAcc1.getAccountNum();
	System.out.println(accNum);
	
	double balance = bankAcc1.getbalance();
	System.out.println(balance);*/
	
	bankAcc1.setBalance(99);
	
	double balance = bankAcc1 .getbalance();
	System.out.println(balance);
	
    bankAcc1.setBalance(1099);
	
	balance = bankAcc1 .getbalance();
	System.out.println(balance);
	
	 bankAcc1.setBalance(-1099);
		
     balance = bankAcc1 .getbalance();
	 System.out.println(balance);
	
	
	
}
}
