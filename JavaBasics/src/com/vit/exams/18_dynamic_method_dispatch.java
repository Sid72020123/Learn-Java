package com.vit.exams;

class DynamicMethodDispatch {
    public static void main(String[] args) {
        Notification notification = new EmailNotification(); // Parent reference, child object.
        notification.send(); // JVM selects EmailNotification.send() at runtime.
        notification = new SmsNotification();
        notification.send();
    }
}
class Notification { void send() { System.out.println("Generic notification"); } }
class EmailNotification extends Notification { @Override void send() { System.out.println("Sending email"); } }
class SmsNotification extends Notification { @Override void send() { System.out.println("Sending SMS"); } }
