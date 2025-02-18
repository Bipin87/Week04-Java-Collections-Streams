package com.capgemini.annotations.advanced_level.implement_custom_caching_system_with_cacheresult;

public class Main {
    public static void main(String[] args) {
        ExpensiveOperations operations = new ExpensiveOperations();

        // First computation (not cached)
        System.out.println("Result: " + operations.computeSquare(5));

        // Second computation (should be cached)
        System.out.println("Result: " + operations.computeSquare(5));
    }
}
