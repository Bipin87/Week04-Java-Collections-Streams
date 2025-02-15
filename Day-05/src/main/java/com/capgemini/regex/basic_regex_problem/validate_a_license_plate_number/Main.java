package com.capgemini.regex.basic_regex_problem.validate_a_license_plate_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Try and catch block to handle the exception
        try{
            // BufferedReader to get the user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine().trim();
            if(LicensePlateNumber.validateLicensePlateNumber(text)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
