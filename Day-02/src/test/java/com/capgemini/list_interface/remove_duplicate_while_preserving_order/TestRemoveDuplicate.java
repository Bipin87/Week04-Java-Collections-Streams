package com.capgemini.list_interface.remove_duplicate_while_preserving_order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.remove_duplicate_while_preserving_order.RemoveDuplicate.removeDuplicate;
import static org.junit.jupiter.api.Assertions.*;

class TestRemoveDuplicate {
    @Test
    public void testFirst(){
        List<String> stringList = new ArrayList<>(Arrays.asList("Bipin","Aman","Abhinav","Bipin"));
        List<String> newStrings=removeDuplicate(stringList);
        System.out.println(newStrings);
        // Performing test
        assertEquals(newStrings,removeDuplicate(stringList));
        assertNotEquals(stringList,removeDuplicate(stringList));
    }
    @Test
    public void testSecond(){
        List<Character>characterList = new ArrayList<>(Arrays.asList('a','b','d','a','e','d','a'));
        List<Character> charList = new ArrayList<>(Arrays.asList('a','b','d','e'));
        // Perform test
        assertEquals(charList,removeDuplicate(characterList));
    }

}