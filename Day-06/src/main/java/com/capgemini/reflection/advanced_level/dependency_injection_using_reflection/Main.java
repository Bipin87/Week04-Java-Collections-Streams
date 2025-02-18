package com.capgemini.reflection.advanced_level.dependency_injection_using_reflection;

public class Main {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();
            UserController userController = container.getInstance(UserController.class);
            userController.sendNotification();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}