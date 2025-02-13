package com.capgemini.set_interface.check_two_set_equals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.check_two_set_equals.CheckTwoSetEquals.checkTwoSet;

public class Main {
    public static void main(String[] args) {
        // Create the objects of set interface
        Set<String> setFirst = new HashSet<>(Arrays.asList("bipin","aman","aryan","bipin"));
        Set<String> setSecond = new HashSet<>(Arrays.asList("bipin","aman","aryan"));
        Set<String> setThird = new HashSet<>();

        // Call the method and store the boolean value
        boolean result = checkTwoSet(setFirst,setSecond);
        boolean result1= checkTwoSet(setFirst,setThird);

        // Display the results
        System.out.println(result);
        System.out.println(result1);

    }
}
