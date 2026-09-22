package com.vit.exams;

class StaticAndThis {
    static int createdCount; // static: shared across every Employee object
    private final String name;
    StaticAndThis(String name) { this.name = name; createdCount++; } // this.name resolves field vs parameter
    void showName() { System.out.println(this.name); }
    public static void main(String[] args) {
        StaticAndThis employee = new StaticAndThis("Meera");
        employee.showName();
        System.out.println("Objects created: " + StaticAndThis.createdCount);
    }
}
