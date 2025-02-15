package com.capgemini.regex.extraction_problems.extract_dates_in_format;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.capgemini.regex.extraction_problems.extract_dates_in_format.ExtractDates.extractDatesInFormat;

public class Main {
    public static void main(String[] args) {
        // Try and catch block to handle the exception
        try{
            // BufferedReader to get the user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine().trim();

            // Call method and display result
            System.out.println(extractDatesInFormat(text));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
