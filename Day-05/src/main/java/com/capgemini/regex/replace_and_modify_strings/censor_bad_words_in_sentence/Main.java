package com.capgemini.regex.replace_and_modify_strings.censor_bad_words_in_sentence;

import java.util.HashSet;
import java.util.Set;

import static com.capgemini.regex.replace_and_modify_strings.censor_bad_words_in_sentence.BadWords.censorWords;

public class Main {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";

        // Define a set of bad words to be censored
        Set<String> badWords = new HashSet<>();
        badWords.add("bad");
        badWords.add("nasty");

        // Call the method and display the result
        String censoredSentence = censorWords(sentence, badWords);
        System.out.println(censoredSentence);
    }
}
