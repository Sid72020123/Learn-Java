package com.vit.basics;

import java.util.Scanner;

public class SimpleBillingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalBill = 0.0;
		int totalProducts = 0;
		char choice;

		System.out.println("===== *** SIMPLE BILLING SYSTEM *** =====");

		do {
			System.out.print("\nEnter product name: ");
			String productName = sc.next();

			System.out.print("Enter product quantity: ");
			int productQuantity = sc.nextInt();

			System.out.print("Enter price per product: ");
			double pricePerProduct = sc.nextDouble();

			double totalCost = pricePerProduct * productQuantity;

			totalProducts += productQuantity;
			totalBill += totalCost;

			System.out.printf("\n[*] Added -> %dx %s (Rate: %.2f) => Cost: %.2f\n[*] Total Bill: %.2f\n",
					productQuantity, productName, pricePerProduct, totalCost, totalBill);

			System.out.print("\nDo you want to add more items? (y/n) ");
			choice = sc.next().toLowerCase().charAt(0);
		} while (choice == 'y');

		double discountRate = 0.0;

		if (totalBill >= 100000) {
			discountRate = 20;
		} else if (totalBill >= 75000) {
			discountRate = 15;
		} else if (totalBill >= 50000) {
			discountRate = 10;
		} else if (totalBill >= 25000) {
			discountRate = 5;
		}

		double totalDiscount = totalBill * (discountRate / 100.0);
		double finalAmount = totalBill - totalDiscount;

		System.out.println("\n\n===== *** FINAL BILL SUMMARY *** =====");
		System.out.printf(
				"\n>>> Total Products: %d\n[*] Total Bill: %.2f\n\n>>> Discount Rate: %.2f %%\n[*] Total Discount: %.2f\n\n[>>> FINAL AMOUNT: %.2f <<<]\n",
				totalProducts, totalBill, discountRate, totalDiscount, finalAmount);
		
		sc.close();
	}
}