package com.bankDetails;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount();
		
		System.out.println("Enter the Account Number:");
		int accountNumber = sc.nextInt();
		bank.setAccountNumber(accountNumber);
		sc.nextLine();
		
		System.out.println("Enter the account Holder Name:");
		String accountHolder = sc.nextLine();
		bank.setAccountHolder(accountHolder);
		
		System.out.println("Enter the account balance");
		double balance = sc.nextDouble();
		bank.setBalance(balance);
		
		System.out.println("Bank Account Details");
		System.out.println("-------------------------");
		
		System.out.println("Account Number:"+bank.getAccountNumber());
		System.out.println("Account Holder:"+bank.getAccountHolder());
		System.out.println("Balance:"+bank.getBalance());
		
		sc.close();
	}

}
