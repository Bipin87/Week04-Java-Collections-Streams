package com.capgemini.regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;

import org.junit.jupiter.api.Test;

import static com.capgemini.regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space.ReplaceMultipleToSingleSpace.replacedSpace;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceMultipleToSingleSpaceTest {
    @Test
    public void test(){
        assertEquals("This is an example with multiple spaces.",replacedSpace("This     is    an example     with multiple  spaces."));
        assertNotEquals("This is an example",replacedSpace("This is an example with multiple spaces"));
    }

}