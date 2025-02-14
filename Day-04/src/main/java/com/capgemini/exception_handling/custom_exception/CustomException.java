package com.capgemini.exception_handling.custom_exception;

public class CustomException {

    // Method to handle the custom exception
    public static String validateAge(int age) throws InvalidAgeException{

        if(age >= 18){
            return "Access granted!";
        }
        else {
            throw new InvalidAgeException("Age must be 18 or above");
        }

    }

}
