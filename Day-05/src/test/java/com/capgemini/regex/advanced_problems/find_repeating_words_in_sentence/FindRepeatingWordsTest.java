package com.capgemini.regex.advanced_problems.find_repeating_words_in_sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatingWordsTest {
    @Test
    void checkRepeatWords(){
        String text = "This is is a repeated repeated word test";
        assertEquals("is",FindRepeatingWords.findRepeatingWords(text).get(0));
    }

}