package com.constructor;

public class BankApplication {

	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		
		System.out.println("Account Created Successfully");
		
	}
	
	public void deposite(double DepositeAmount) {
		if(DepositeAmount >= 0) {
			balance += DepositeAmount;
			System.out.println("Balance Updated");
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double WithdrawAmount) {
		if((balance > WithdrawAmount) && (WithdrawAmount > 0)) {
			balance -= WithdrawAmount;
			System.out.println("Amount Deducted");
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void showBalance() {
		System.out.println("Current Bank Balance is:"+balance);
	}
	
}
