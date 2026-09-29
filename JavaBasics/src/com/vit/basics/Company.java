package com.vit.basics;

import com.vit.management.Manager;

public class Company {
	public static void main(String[] args) {
		Manager m = new Manager(101, "Siddhesh", 100, "Development");

		System.out.println("\nEmployee details are:");
		m.display();
	}
}
