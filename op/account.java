package com.rays.op;

public class account {
	private String number;
	private String accountType;
	private double balance;
	
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
}
     public void setBalance(double balance) {
	     this.balance = balance;
}
     public double getBalance() {
    	   return balance;
     }
      public void deposite(double bal) {
    	  
    	     double current = bal + getBalance();
    	     setBalance(current);
    	     
      }
         public void  withdrwal (double with) {
        	 double after = getBalance() - with;
        	 setBalance(after);
         }
         
         public void fundsTransfer (double ft) {
        	  double after = getBalance() - ft;
        	  setBalance(after);
        	  
         }
         
         
         
         
         
         
         



}