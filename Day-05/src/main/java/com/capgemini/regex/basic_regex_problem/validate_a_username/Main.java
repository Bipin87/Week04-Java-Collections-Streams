package com.capgemini.regex.basic_regex_problem.validate_a_username;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine().trim();
            if(UserName.validateUserName(text)){
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
