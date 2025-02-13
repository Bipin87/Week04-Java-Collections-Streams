package com.capgemini.set_interface.convert_set_to_sorted_list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.convert_set_to_sorted_list.ConvertSet.convertSortedList;
import static org.junit.jupiter.api.Assertions.*;

class TestSetToListConversion {
    //create a set
    Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));

    @Test
    void test1(){
        assertEquals(Arrays.asList(1,3,5,9), convertSortedList(set));
    }

    //Below test case is meant to be fail
    @Test
    void test2(){
        //assertEquals(Arrays.asList(1,3,9,5), convertSortedList(hashSet)); // Fail case
        assertNotEquals(Arrays.asList(1,3,9,5), convertSortedList(set));
    }

}