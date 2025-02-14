package com.capgemini.exception_handling.finally_block_exception;

public class FinallyBlockException {
    // Method to handle exception and print finally block
    public static String divideOperation(int number1, int number2) {
        try {
            int result = number1 / number2;
            return "Result: " + result;
        } catch (ArithmeticException e) {
            return "Error: Cannot divide by zero.";
        } finally {
            System.out.println("Operation completed");
        }
    }
}
