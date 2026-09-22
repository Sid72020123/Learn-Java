package com.vit.exams;

class ConstructorsAndFinalize {
    public static void main(String[] args) {
        Resource resource = new Resource("example.txt"); // Constructor initializes a new object.
        resource.close(); // Prefer explicit cleanup or try-with-resources.
    }
}

class Resource {
    private final String name;
    Resource(String name) { this.name = name; System.out.println("Opened " + name); }
    void close() { System.out.println("Closed " + name); }
    // finalize() was historically called by the garbage collector before reclamation.
    // It is deprecated for removal, unpredictable, and should not be implemented in new code.
    // Use close() or try-with-resources for deterministic cleanup instead.
}
