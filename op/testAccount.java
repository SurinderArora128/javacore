package com.rays.op;

public class testAccount {
public static void main(String[] args) {
	
	account a = new account();
	a.setBalance(1000);
	System.out.println("Balance before Deposite-------" +a.getBalance());
			a.deposite(5000);
			System.out.println("Balance after Deposite-----" +a.getBalance());
	
		a.withdrwal(2500);
			
	System.out.println("balance after withdrawl     "+a.getBalance());
	
	a.fundsTransfer(500);
	System.out.println("balance agter Fund transfer  - " +a.getBalance());
	
}
}
