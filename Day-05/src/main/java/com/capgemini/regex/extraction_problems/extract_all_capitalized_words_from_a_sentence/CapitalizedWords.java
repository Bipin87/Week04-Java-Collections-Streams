package com.capgemini.regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;

import java.util.ArrayList;
import java.util.regex.*;
import java.util.regex.Pattern;

public class CapitalizedWords {
    // Method to extract the capitalized words
    public static ArrayList<String> extractCapitalizedWords(String text){
        String regex = "\\b[A-Z][A-Za-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> words = new ArrayList<>();

        while(matcher.find()){
            // add email in arrayList
            words.add(matcher.group());
        }

        return words;
    }
}
