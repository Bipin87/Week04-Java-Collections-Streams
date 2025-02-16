package com.capgemini.regex.advanced_problems.validate_social_security_number;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter the text: ");
            String text = br.readLine().trim();

            // Call method and display result
            String result = ValidateSSN.validateSecurityNumber(text);
            System.out.println(result);
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
