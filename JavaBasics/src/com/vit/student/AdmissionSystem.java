package com.vit.student;

class CollegeStudent {
    int age;
    String name;

    CollegeStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkAdmission() throws Exception {
        if (age < 18) {
            throw new Exception("Admission rejected! Age must be 18 or above.");
        } else {
            System.out.println("Admission successful!");
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
        }
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
    	CollegeStudent s1 = new CollegeStudent("Student 1", 16);

        try {
            s1.checkAdmission();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        CollegeStudent s2 = new CollegeStudent("Student 2", 20);

        try {
            s2.checkAdmission();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}