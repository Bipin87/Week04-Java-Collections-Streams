package com.capgemini.exception_handling.custom_exception;

import static com.capgemini.exception_handling.custom_exception.CustomException.validateAge;

public class Main {
    public static void main(String[] args) {
        try {
            // Call method and display result
            String result = validateAge(23);
            System.out.println(result);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

    }
}
