package com.capgemini.regex.advanced_problems.extract_programming_language_name_from_text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractProgLanguageTest {

    @Test
    void checkStringOne(){
        String text = "I love Java";
        assertEquals("Java",ExtractProgLanguage.extractProgrammingLanguage(text));
    }
}