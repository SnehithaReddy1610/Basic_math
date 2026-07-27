package com.constructor;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String customerName = sc.next();
		System.out.println("Enter your Address:");
		String customerAddress = sc.next();
		System.out.println("Enter your phone Number:");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter your initial Amount:");
		double balance = sc.nextDouble();
		
		BankApplication ba = new BankApplication(customerName, customerAddress, phoneNumber, balance);
		
		
		int choice;
		do{
			System.out.println("***** Select an Option from Below******");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Show Balance");
			System.out.println("4.Exit");
			
			choice  = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the amount to be withdraw:");
				double WithdrawAmount = sc.nextDouble();
				ba.withdraw(WithdrawAmount );
				break;
			case 2:
				System.out.println("Entert the amount to be deposite:");
				double DepositeAmount = sc.nextDouble();
				ba.deposite(DepositeAmount);
		        break;
			case 3:
				ba.showBalance();
				break;
			case 4:
				System.out.println("Thank you!");
				break;	
			default:
				System.out.println("Invalid Choice");
			}
		}while(choice != 4);
		sc.close();
		
	}

}
