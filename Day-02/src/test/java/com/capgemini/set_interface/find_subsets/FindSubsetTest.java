package com.capgemini.set_interface.find_subsets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsetTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));
    Set<Integer> set3 = new HashSet<>(Arrays.asList(4,5));
    Set<Integer> set4 = new HashSet<>();

    @Test
    void checkForSubsetTest1(){
        assertTrue(set2.containsAll(set1));
    }

    //Below test is meant to fail
    @Test
    void checkForSubsetTest2(){
        //assertTrue(set2.containsAll(set3)); // Fail case
        assertTrue(set4.isEmpty());
    }

}