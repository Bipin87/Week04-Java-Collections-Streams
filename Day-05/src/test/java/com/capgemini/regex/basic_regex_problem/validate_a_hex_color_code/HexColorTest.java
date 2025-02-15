package com.capgemini.regex.basic_regex_problem.validate_a_hex_color_code;

import org.junit.jupiter.api.Test;

import static com.capgemini.regex.basic_regex_problem.validate_a_hex_color_code.HexColor.validateHexColorCode;
import static org.junit.jupiter.api.Assertions.*;

class HexColorTest {
    @Test
    public void testValid(){
        // Test perform valid case
        assertTrue(validateHexColorCode("#AA0001"));
    }
    @Test
    public void testInvalid(){
        // Test perform invalid case
        assertFalse(validateHexColorCode("BXX345"));
    }

}