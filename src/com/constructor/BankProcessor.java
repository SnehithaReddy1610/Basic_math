package com.constructor;

public class BankProcessor {

	public static void main(String[] args) {

		BankAccount b = new BankAccount(101,"Prasad",90000);
		System.out.println("AccountNumber:"+b.getAccountNum());
		System.out.println("Account Holder:"+b.getAccHolder());
		System.out.println("Bank Balance:"+b.getBalance());
		b.deposite(10000);
		b.withdraw(50000);
		
	}

}
