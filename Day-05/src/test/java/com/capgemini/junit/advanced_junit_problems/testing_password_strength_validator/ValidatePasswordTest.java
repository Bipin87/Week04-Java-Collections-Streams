package com.capgemini.junit.advanced_junit_problems.testing_password_strength_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePasswordTest {

    @Test
    void testValidPasswords() {
        assertTrue(ValidatePassword.isValidPassword("StrongPass1"));
        assertTrue(ValidatePassword.isValidPassword("Hello123"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(ValidatePassword.isValidPassword("short")); // Too short
        assertFalse(ValidatePassword.isValidPassword("nouppercase1")); // No uppercase
        assertFalse(ValidatePassword.isValidPassword("NoNumbersHere")); // No digit
        assertFalse(ValidatePassword.isValidPassword("")); // Empty password
        assertFalse(ValidatePassword.isValidPassword(null)); // Null password
    }
}