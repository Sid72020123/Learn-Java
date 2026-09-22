package com.vit.exams;

public class Topic13EncapsulationAndAccess {
    public static void main(String[] args) {
        SecureProfile profile = new SecureProfile("Nina");
        profile.setAge(20);
        System.out.println(profile.getName() + ": " + profile.getAge());
    }
}

class SecureProfile {
    private final String name; // private: visible only in this class
    private int age;
    SecureProfile(String name) { this.name = name; } // package-private: same package only
    public String getName() { return name; } // public: accessible everywhere
    public int getAge() { return age; }
    public void setAge(int age) { if (age >= 0) this.age = age; } // validates protected data
    protected void protectedExample() { } // protected: this package and subclasses
}
