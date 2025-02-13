package com.capgemini.set_interface.check_two_set_equals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.check_two_set_equals.CheckTwoSetEquals.checkTwoSet;
import static org.junit.jupiter.api.Assertions.*;

class TestTwoSet {
    Set<Integer> integerSet = new HashSet<>(Arrays.asList(2,3,1,4,5,6));
    Set<Integer> integers = new HashSet<>(Arrays.asList(1,1,2,3,2,1,4,5,4,6));
    Set<Integer>newSet = new HashSet<>();
    @Test
    public void testFirst(){
        //Performing test
        assertTrue(checkTwoSet(integerSet,integers));
    }
    @Test
    public void testSecond(){
        // Performing the tests
        assertEquals(true,checkTwoSet(integerSet,integers));
        assertNotEquals(true,checkTwoSet(integerSet,newSet));
    }


}