package com.vit.basics;

import java.util.Scanner;

public class VoterEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter voter name: ");
		String name = sc.next();

		System.out.print("Enter the age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println(name + " is eligible to vote!");
		} else {
			System.out.println(name + " is NOT eligible to vote!");
		}
		
		sc.close();
	}

}