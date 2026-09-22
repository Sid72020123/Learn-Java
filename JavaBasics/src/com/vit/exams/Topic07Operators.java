package com.vit.exams;

public class Topic07Operators {
	public static void main(String[] args) {
		int a = 10, b = 3;
		System.out.println("Arithmetic: " + (a + b) + ", " + (a % b));
		System.out.println("Relational: " + (a > b));
		System.out.println("Logical: " + (a > 5 && b < 5));
		System.out.println("Ternary: " + (a % 2 == 0 ? "even" : "odd"));
		a += 2; // Assignment operator
		System.out.println("Updated a: " + a);
	}
}
