package com.capgemini.set_interface.symmetric_difference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.symmetric_difference.SymmetricDifference.findDifference;
import static org.junit.jupiter.api.Assertions.*;

public class SymmetricDifferenceTest {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    @Test
    void findSymmetricTest1(){
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 4, 5)), findDifference(set1, set2));
    }

    //Below test case is meant to be fail
    @Test
    void findSymmetricTest2(){
        //assertEquals(new HashSet<>(Arrays.asList(1, 2, 3, 5)), findDifference(set1, set2)); // fail case
        assertNotEquals(set1, findDifference(set1,set2));
    }

}