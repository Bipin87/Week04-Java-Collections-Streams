package com.capgemini.reflection.advanced_level.dependency_injection_using_reflection;


public class EmailService implements Service {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Sent: " + message);
    }
}