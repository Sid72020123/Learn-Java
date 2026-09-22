package com.vit.exams;

/** Java is platform independent because source code is compiled to JVM bytecode. */
class JavaFeatures {
    public static void main(String[] args) {
        System.out.println("Java features: platform independent, object-oriented, robust, secure, multithreaded.");
        try {
            int result = 10 / 2; // Robustness includes structured exception handling.
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Invalid arithmetic operation.");
        }
    }
}
