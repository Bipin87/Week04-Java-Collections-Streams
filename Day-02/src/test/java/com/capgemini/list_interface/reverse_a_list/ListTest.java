package com.capgemini.list_interface.reverse_a_list;

import org.junit.jupiter.api.Test;

import java.util.*;

import static com.capgemini.list_interface.reverse_a_list.ReversedList.reversedArrayList;
import static com.capgemini.list_interface.reverse_a_list.ReversedList.reversedLinkedList;
import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    public void testFirst(){
        List<String> arrayList = new ArrayList<>(Arrays.asList("BK Sahu","Deepraj","Anurag"));
        reversedArrayList(arrayList);
        List<String> linkedList = new LinkedList<>(Arrays.asList("BK Sahu","Deepraj","Anurag"));
        reversedLinkedList(linkedList);
        // Test perform
        assertEquals(linkedList,arrayList);
    }
    @Test
    public void testSecond(){
        List<String> arrayList = new ArrayList<>(Arrays.asList("BK Sahu","Deepraj","Anurag"));
        reversedArrayList(arrayList);
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(2,4,3,5,6));
        reversedLinkedList(linkedList);
        // Test perform with different types
        assertNotEquals(linkedList,arrayList);
    }
    @Test
    public void testThird(){
        List<String>arrayList = new ArrayList<>(Arrays.asList());
        reversedArrayList(arrayList);

        List<Integer>linkedList = new LinkedList<>(Arrays.asList(1,2,3,4));
        reversedLinkedList(linkedList);
        // Performing test
        assertTrue(arrayList.isEmpty());
        assertNotEquals(Collections.singletonList(4),linkedList);

    }

}