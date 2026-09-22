package com.vit.exams;

class Composition {
    public static void main(String[] args) { House house = new House(); house.showRoom(); }
}
class House {
    // Room is created and owned by House; its lifetime is tied to the House object.
    private final Room room = new Room("Living room");
    void showRoom() { System.out.println(room.name); }
    private static class Room { final String name; Room(String name) { this.name = name; } }
}
