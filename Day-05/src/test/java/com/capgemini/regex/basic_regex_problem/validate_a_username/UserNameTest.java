package com.capgemini.regex.basic_regex_problem.validate_a_username;

import org.junit.jupiter.api.Test;

import static com.capgemini.regex.basic_regex_problem.validate_a_username.UserName.validateUserName;
import static org.junit.jupiter.api.Assertions.*;

class UserNameTest {
    @Test
    public void testValid(){
        assertTrue(validateUserName("bipin_23"));
    }
    @Test
    public void testInvalid(){
        assertFalse(validateUserName("Bwef"));
    }

}