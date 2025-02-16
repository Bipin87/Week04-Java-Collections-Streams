package com.capgemini.junit.testing_list_operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOperationsTest {
    private ListOperations listOperations;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listOperations = new ListOperations();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listOperations.addElement(list, 10);
        assertTrue(list.contains(10));
        System.out.println("Test1 Passed");
    }

    @Test
    void testRemoveElement() {
        listOperations.addElement(list, 20);
        assertTrue(listOperations.removeElement(list, 20));
        assertFalse(list.contains(20));
        System.out.println("Test2 Passed");
    }

    @Test
    void testRemoveElement_NotPresent() {
        assertFalse(listOperations.removeElement(list, 30));
        System.out.println("Test3 Passed");
    }

    @Test
    void testGetSize() {
        listOperations.addElement(list, 5);
        listOperations.addElement(list, 15);
        assertEquals(2, listOperations.getSize(list));
        System.out.println("Test4 Passed");
    }

}