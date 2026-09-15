package com.vit.basics;

import java.util.Scanner;

interface UPIPaymentTransaction {
	void makeUPITransaction(double amount);
}

interface NetBankingTransaction {
	void makeNetBankingTransaction(double amount);
}

interface CreditCardTransaction {
	void makeCreditCardTransaction(double amount);
}

class BankTransaction implements UPIPaymentTransaction, NetBankingTransaction, CreditCardTransaction {
	public void makeCreditCardTransaction(double amount) {
		System.out.println("[NEW] Credit Card Transaction: " + amount);
	}

	public void makeNetBankingTransaction(double amount) {
		System.out.println("[NEW] Net Banking Transaction: " + amount);
	}

	public void makeUPITransaction(double amount) {
		System.out.println("[NEW] UPI Transaction: " + amount);
	}
}

public class DigitalBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankTransaction bt = new BankTransaction();

		int choice = 0;
		while (choice != 4) {
			System.out.println("\n=== Digital Bank ===");
			System.out.println("1. UPI Payment\n2. Credit Card Payment\n3. Net Banking\n4. [EXIT]");

			System.out.print("Enter an option: ");
			choice = sc.nextInt();

			float amount = 0;
			if (choice != 4) {
				System.out.print("Enter an amount: ");
				amount = sc.nextFloat();
			}
			System.out.println("\n");

			switch (choice) {
			case 1:
				bt.makeUPITransaction(amount);
				break;
			case 2:
				bt.makeCreditCardTransaction(amount);
				break;
			case 3:
				bt.makeNetBankingTransaction(amount);
				break;
			case 4:
				System.out.println("Exiting...\n");
				break;
			default:
				System.out.println("Invalid choice entered! Please try again...\n");
			}
		}

		sc.close();
	}
}
