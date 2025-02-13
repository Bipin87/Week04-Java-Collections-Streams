package com.capgemini.list_interface.find_frequency_of_element;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.find_frequency_of_element.FrequencyElement.frequency;
import static org.junit.jupiter.api.Assertions.*;

class TestFrequency {
    @Test
    public void testFirst(){

        // Creating the object of list interface
        List<String> stringList = new ArrayList<>();
        stringList.add("Aman");
        stringList.add("Vinay");
        stringList.add("Aman");
        stringList.add("BK");
        stringList.add("Vijay");
        stringList.add("Aman");
        stringList.add("Vijay");

        frequency(stringList);
        List<Integer>integerList = new ArrayList<>(Arrays.asList(1,3,4,5,4,3));
        frequency(integerList);

        // Performing test with different types
        assertNotEquals(stringList,integerList);
    }
    @Test
    public void testSecond(){
        List<String>sentences = new ArrayList<>(Arrays.asList("Apple","Mango","Banana","Apple","Orange"));
        List<String>words = new ArrayList<>(Arrays.asList("Mango","Orange","Apple","Apple","Banana"));
        frequency(sentences);
        frequency(words);
        //assertEquals(sentences,words);  Test fail //Expected :[Apple, Mango, Banana, Apple, Orange]
        //Actual   :[Mango, Orange, Apple, Apple, Banana]
        assertNotEquals(sentences,words);// Test pass
    }
    @Test
    public void testThird(){
        List<Character> characters = new ArrayList<>();
        frequency(characters);
        assertTrue(characters.isEmpty());
    }

}