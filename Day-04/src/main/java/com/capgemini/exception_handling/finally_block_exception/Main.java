package com.capgemini.exception_handling.finally_block_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user inputs
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Call the method and display result
        String result = FinallyBlockException.divideOperation(num1, num2);
        System.out.println(result);

        scanner.close();
    }
}
