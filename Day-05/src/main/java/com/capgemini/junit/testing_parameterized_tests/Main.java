package com.capgemini.junit.testing_parameterized_tests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        // Call the method and display result
        System.out.println(ParameterizedTests.isEven(number));
    }
}
