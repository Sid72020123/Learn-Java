package com.vit.exams;

/** Demonstrates the four main OOP principles and their practical benefits. */
class OOPIntroduction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Asha", 1_000);
        account.deposit(250); // Encapsulation: balance is protected inside the class.
        System.out.println(account.getOwner() + " has Rs. " + account.getBalance());
        // Benefits: code is reusable, modular, easier to maintain, and can hide data safely.
    }
}

class BankAccount {
    private final String owner;
    private double balance;

    BankAccount(String owner, double openingBalance) { this.owner = owner; balance = openingBalance; }
    void deposit(double amount) { if (amount > 0) balance += amount; }
    String getOwner() { return owner; }
    double getBalance() { return balance; }
}
