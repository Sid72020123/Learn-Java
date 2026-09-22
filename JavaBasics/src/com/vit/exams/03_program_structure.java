package com.vit.exams;

// A Java program can contain comments, a class, fields, methods, and main().
class JavaProgramStructure {
    private static final String GREETING = "Hello, Java!"; // Field (class data)

    public static void main(String[] args) { // Execution begins here.
        printGreeting();
    }

    private static void printGreeting() { // Method (class behavior)
        System.out.println(GREETING);
    }
}
