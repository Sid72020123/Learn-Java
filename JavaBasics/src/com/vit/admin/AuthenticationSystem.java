package com.vit.admin;

import java.util.Scanner;

public class AuthenticationSystem {
	static final String correctUsername = "admin";
	static final String correctPassword = "admin123";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("=== Authentication System ===\n");

			System.out.print("Enter Username: ");
			String username = sc.nextLine();

			if (username == null || username.trim().isEmpty()) {
				throw new NullPointerException("Username cannot be null or empty!");
			}

			System.out.print("Enter Password: ");
			String password = sc.nextLine();

			if (password == null || password.trim().isEmpty()) {
				throw new NullPointerException("Password cannot be null or empty!");
			}

			if (username.equals(correctUsername) && password.equals(correctPassword)) {
				System.out.println("\nLogged in Successfully.\n");
				System.out.println("Welcome, " + username + "!");
			} else {
				throw new SecurityException("Incorrect Username or Password!");
			}

		} catch (NullPointerException e) {
			System.out.println("\nInvalid Input: " + e.getMessage());
		} catch (SecurityException e) {
			System.out.println("\nLogin Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("\nUnexpected Error: " + e.getMessage());
		} finally {
			System.out.println("\nAuthentication Process Complete.\nExiting...");

			sc.close();
		}
	}
}
