package com.vit.exams;

class SingleInheritance {
    public static void main(String[] args) { Dog dog = new Dog(); dog.eat(); dog.bark(); }
}
class Animal { void eat() { System.out.println("Animal eats"); } }
class Dog extends Animal { void bark() { System.out.println("Dog barks"); } }
