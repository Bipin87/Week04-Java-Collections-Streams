package com.capgemini.junit.testing_string_utility_methods.testing_string_utility_methods;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityMethodsTest {

    @Test
    void testReverse() {
        assertEquals("dcba", UtilityMethods.reverse("abcd"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(UtilityMethods.isPalindrome("madam"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", UtilityMethods.toUpperCase("hello"));
    }
}