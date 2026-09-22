package com.vit.exams;

class CompileTimePolymorphism {
    // Method overloading is compile-time polymorphism: the compiler chooses by arguments.
    static void print(int value) { System.out.println("Integer: " + value); }
    static void print(String value) { System.out.println("Text: " + value); }
    public static void main(String[] args) { print(12); print("twelve"); }
}
