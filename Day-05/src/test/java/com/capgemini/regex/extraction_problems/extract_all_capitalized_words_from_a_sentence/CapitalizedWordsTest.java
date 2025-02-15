package com.capgemini.regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.capgemini.regex.extraction_problems.extract_all_capitalized_words_from_a_sentence.CapitalizedWords.extractCapitalizedWords;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizedWordsTest {
    @Test
    public void testValidCase(){
        // Test perform valid case
        ArrayList<String> words=extractCapitalizedWords("The Eiffel Tower is in Paris and the Statue of Liberty is in New York");
        assertEquals("The",words.get(0));
        assertFalse(words.isEmpty());
    }
    @Test
    public void testInvalidCase(){
        // Test perform invalid case
        assertNotEquals("York",extractCapitalizedWords("The Eiffel Tower is in Paris and the Statue of Liberty is in New York"));
    }

}