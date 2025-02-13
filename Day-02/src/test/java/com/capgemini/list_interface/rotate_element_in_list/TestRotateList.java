package com.capgemini.list_interface.rotate_element_in_list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.rotate_element_in_list.RotatedList.rotateList;
import static org.junit.jupiter.api.Assertions.*;

class TestRotateList {
    @Test
    public void testFirst(){
        List<String> stringList = new ArrayList<>(Arrays.asList("Bipin","Vipul","Deepraj","Abhinav"));
        List<Character> charList = new ArrayList<>();
        System.out.println(stringList);
        int position = 3;
        rotateList(stringList,position);
        System.out.println(stringList);
        // Performing test
        assertNotEquals(charList,stringList);


    }
    @Test
    public void testSecond(){
        List<Integer>integerList = new ArrayList<>();
        rotateList(integerList,0);
        assertTrue(integerList.isEmpty());
    }

}