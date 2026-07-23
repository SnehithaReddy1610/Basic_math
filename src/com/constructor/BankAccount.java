package com.constructor;

public class BankAccount {
	int accountNum;
	String accHolder;
	double balance;
	
	public BankAccount(int accountNum,String accHolder,double balance) {
		this.accountNum = accountNum;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccountNum() {
		return accountNum;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposite(double amount) {
		balance += amount;
		System.out.println("Balance amount After Deposite:"+balance);
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Balance Amount After withdrawal:"+balance);
		}
	}
	

}
