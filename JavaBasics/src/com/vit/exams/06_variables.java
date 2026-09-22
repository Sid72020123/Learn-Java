package com.vit.exams;

class Variables {
    static int classCounter = 0; // Static/class variable: shared by all objects.
    int instanceCounter;         // Instance variable: one copy per object.

    public static void main(String[] args) {
        Variables example = new Variables();
        int localNumber = 10; // Local variable: exists only during this method call.
        example.instanceCounter++;
        classCounter++;
        System.out.println(localNumber + ", " + example.instanceCounter + ", " + classCounter);
    }
}
