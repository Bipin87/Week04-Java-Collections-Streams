package com.capgemini.list_interface.find_nth_element_from_the_end;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.find_nth_element_from_the_end.FindElement.findNthElementEnd;
import static org.junit.jupiter.api.Assertions.*;

class FindNthElementEndTest {
    @Test
    public void testFirst(){
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,2,5,6,7,9));
        int position = 4;
        int result=findNthElementEnd(list,position);

        assertEquals(5,findNthElementEnd(list,position));
    }
    @Test
    public void testSecond(){
        List<Character> characterList = new ArrayList<>();
        assertTrue(characterList.isEmpty());
    }

}