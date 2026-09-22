package com.vit.exams;

public class Topic23RuntimePolymorphism {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.pay(500); // Overridden implementation is selected at runtime.
    }
}
class Payment { void pay(double amount) { System.out.println("Generic payment: " + amount); } }
class CardPayment extends Payment { @Override void pay(double amount) { System.out.println("Card payment: " + amount); } }
