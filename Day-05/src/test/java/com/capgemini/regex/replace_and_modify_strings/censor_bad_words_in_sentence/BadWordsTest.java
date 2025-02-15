package com.capgemini.regex.replace_and_modify_strings.censor_bad_words_in_sentence;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static com.capgemini.regex.replace_and_modify_strings.censor_bad_words_in_sentence.BadWords.censorWords;
import static org.junit.jupiter.api.Assertions.*;

class BadWordsTest {
    @Test
    public void test(){
        String sentence = "This is a damn bad example with some stupid words.";

        // Define a set of bad words to be censored
        Set<String> badWords = new HashSet<>();
        badWords.add("damn");
        badWords.add("stupid");

        assertEquals("This is a **** bad example with some **** words.",censorWords(sentence,badWords));
    }


}