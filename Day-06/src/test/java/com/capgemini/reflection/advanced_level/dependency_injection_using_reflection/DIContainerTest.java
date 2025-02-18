package com.capgemini.reflection.advanced_level.dependency_injection_using_reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIContainerTest {
    @Test
    void testDependencyInjection() {
        try {
            DIContainer container = new DIContainer();
            UserController userController = container.getInstance(UserController.class);

            assertNotNull(userController, "UserController instance should not be null!");
            assertNotNull(userController.getService(), "Service should be injected!");

            // Simulate sending a message
            userController.sendNotification();
        } catch (Exception e) {
            fail("Error occurred exception caught" + e.getMessage());
        }
    }
}

