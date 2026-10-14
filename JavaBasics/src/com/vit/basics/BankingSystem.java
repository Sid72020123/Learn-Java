package com.vit.basics;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class AmountLimitExceededException extends Exception {
	public AmountLimitExceededException(String message) {
		super(message);
	}
}

class Account {
	String accountHolderName;
	double balance;
	
	static double amountTransactionLimit = 50000;

	public Account(String name, double balance) {
		this.accountHolderName = name;
		this.balance = balance;
	}

	public void withdrawAmount(double amount) throws IllegalArgumentException, InsufficientBalanceException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount should be greater than zero.");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Account Balance.");
		}

		this.balance -= amount;

		System.out.println("=== Withdraw Transaction Successful ===");
		System.out.println("[*] Withdraw Amount: " + amount);
		System.out.println("[*] Remaining Balance: " + this.balance);
	}	
	
	public void depositAmount(double amount) throws IllegalArgumentException, AmountLimitExceededException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount should be greater than zero.");
		}
		
		if (amount > amountTransactionLimit) {
			throw new AmountLimitExceededException("Maximum amount limit exceeded.\nPlease use an amount less than " + amountTransactionLimit);
		}
		
		this.balance += amount;

		System.out.println("=== Deposit Transaction Successful ===");
		System.out.println("[*] Deposit Amount: " + amount);
		System.out.println("[*] Remaining Balance: " + this.balance);
	}

	public void displayAccountInfo() {
		System.out.println("\n=== Account Information ===");
		System.out.println("[*] Account Holder: " + this.accountHolderName);
		System.out.println("[*] Account Balance: " + this.balance);
	}
}

public class BankingSystem {
	static void printMenu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1. Withdraw Amount");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Exit Application");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account("Siddhesh", 10000);

		System.out.println("===*** Banking System ***===");
		
		int choice;
		do {
			a.displayAccountInfo();
			printMenu();
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("\nEnter the amount to withdraw: ");
					double withdrawAmount = sc.nextDouble();
			
					try {
						a.withdrawAmount(withdrawAmount);
					} catch (IllegalArgumentException e) {
						System.out.println("\nError while performing withdraw transaction: " + e.getMessage());
					} catch (InsufficientBalanceException e) {
						System.out.println("\nError while performing withdraw transaction: " + e.getMessage());
					}
					break;
				case 2:
					System.out.print("\nEnter the amount to deposit: ");
					double depositAmount = sc.nextDouble();
			
					try {
						a.depositAmount(depositAmount);
					} catch (IllegalArgumentException e) {
						System.out.println("\nError while performing deposit transaction: " + e.getMessage());
					} catch (AmountLimitExceededException e) {
						System.out.println("\nError while performing deposit transaction: " + e.getMessage());
					}
					break;
				case 3:
					System.out.println("\nExiting...");
					break;
				default:
					System.out.println("Invalid choice! Try again...");
			}
		} while (choice != 3);
		
		sc.close();
	}
}
