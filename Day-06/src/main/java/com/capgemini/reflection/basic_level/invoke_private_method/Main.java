package com.capgemini.reflection.basic_level.invoke_private_method;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Use reflection to invoke the private multiply method
            int result = (int) Reflection.invokePrivateMethod(calculator, "multiply", new Class[]{int.class, int.class}, 5, 10);

            // Display the result
            System.out.println("Multiplication Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
