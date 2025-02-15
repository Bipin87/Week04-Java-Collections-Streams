package com.capgemini.regex.replace_and_modify_strings.censor_bad_words_in_sentence;

import java.util.Set;

public class BadWords {
    public static String censorWords(String sentence, Set<String> badWords) {
        // Split the sentence into words using space
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();


        for (String word : words) {
            // Convert word to lowercase for case-insensitive matching
            String lowerWord = word.toLowerCase();
            if (badWords.contains(lowerWord)) {
                // Replace the bad word with "****"
                stringBuilder.append("****").append(" ");
            } else {

                stringBuilder.append(word).append(" ");
            }
        }


        return stringBuilder.toString().trim();
    }

}
