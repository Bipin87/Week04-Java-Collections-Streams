package com.capgemini.regex.advanced_problems.validate_social_security_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSSNTest {

    @Test
    public void testValidSSNExtraction() {
        String text = "My SSN is 123-45-6789.";
        String expected = "123-45-6789 is valid";
        assertEquals(expected, ValidateSSN.validateSecurityNumber(text));
    }
}