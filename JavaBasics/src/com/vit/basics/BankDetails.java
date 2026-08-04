package com.vit.basics;

class BankAccount {
	long accountNumber;
	String accountHolderName;
	double accountBalance;

	// Non-parameterised Constructor
	BankAccount() {
		accountNumber = 0;
		accountHolderName = "<Unknown>";
		accountBalance = 0.0;
	}

	// Parameterized Constructors
	BankAccount(long accNum) {
		accountNumber = accNum;
		accountHolderName = "<Unknown>";
		accountBalance = 0.0;
	}

	BankAccount(long accNum, String accHolderName) {
		accountNumber = accNum;
		accountHolderName = accHolderName;
		accountBalance = 0.0;
	}

	BankAccount(long accNum, String accHolderName, double accBalance) {
		accountNumber = accNum;
		accountHolderName = accHolderName;
		accountBalance = accBalance;
	}

	public void displayDetails() {
		System.out.println("=== *** ACCOUNT DETAILS *** ===");
		System.out.println("\t[*] Account Number: " + accountNumber);
		System.out.println("\t[*] Account Holder Name: " + accountHolderName);
		System.out.println("\t[*] Account Balance: " + accountBalance + "\n\n");
	}
}

public class BankDetails {
	public static void main(String[] args) {

		// Non-parameterised Constructor
		BankAccount account_1 = new BankAccount();

		// Parameterized Constructors
		BankAccount account_2 = new BankAccount(1234567890l);
		BankAccount account_3 = new BankAccount(1234567890l, "Person");
		BankAccount account_4 = new BankAccount(1234567890l, "Person", 987654);
		
		System.out.println("Non-parameterized constructor:");
		account_1.displayDetails();
		System.out.println("Overloaded Parameterized constructor with accNum parameter:");
		account_2.displayDetails();
		System.out.println("Overloaded Parameterized constructor with accNum, accHolderName parameters:");
		account_3.displayDetails();
		System.out.println("Overloaded Parameterized constructor with accNum, accHolderName, accBalance parameters:");
		account_4.displayDetails();
	}
}
