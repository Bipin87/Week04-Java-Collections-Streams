package com.capgemini.regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.capgemini.regex.extraction_problems.extract_all_capitalized_words_from_a_sentence.CapitalizedWords.extractCapitalizedWords;

public class Main {
    public static void main(String[] args) {
        // Try and catch block to handle the exception
        try{
            // BufferedReader to get the user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine().trim();

            // Call method and display result
            System.out.println(extractCapitalizedWords(text));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
