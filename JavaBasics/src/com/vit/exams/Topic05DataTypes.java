package com.vit.exams;

/**
 * Primitive types store values directly; reference types store object
 * references.
 */
public class Topic05DataTypes {
	public static void main(String[] args) {
		byte small = 100;
		short shortNumber = 30_000;
		int count = 42;
		long population = 8_000_000_000L;
		float price = 19.5F;
		double pi = 3.14159;
		char grade = 'A';
		boolean active = true;
		String message = "Reference type";
		System.out.println(small + ", " + shortNumber + ", " + count + ", " + population);
		System.out.println(price + ", " + pi + ", " + grade + ", " + active + ", " + message);
	}
}
