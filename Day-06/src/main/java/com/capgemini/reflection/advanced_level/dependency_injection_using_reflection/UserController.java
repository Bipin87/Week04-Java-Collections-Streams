package com.capgemini.reflection.advanced_level.dependency_injection_using_reflection;

public class UserController {
    @Inject  // Marks field for dependency injection
    private Service service;

    public void sendNotification() {
        service.sendMessage("Welcome to Dependency Injection!");
    }
    public Service getService() {
        return service;
    }

}