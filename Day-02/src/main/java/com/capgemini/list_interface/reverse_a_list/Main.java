package com.capgemini.list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.capgemini.list_interface.reverse_a_list.ReversedList.reversedArrayList;
import static com.capgemini.list_interface.reverse_a_list.ReversedList.reversedLinkedList;

public class Main {
    public static void main(String[] args) {
        // Create the object of ArrayList
        List<Integer> arrayList = new ArrayList<>();
        // Add the element in list
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);

        // Call the method
        reversedArrayList(arrayList);
        // Create the object of LinkedList
        List<Integer>linkedList = new LinkedList<>();
        // Add the element in list
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(9);
        // Call the method
        reversedLinkedList(linkedList);

        // Display the result
        System.out.println("Reverse list using ArrayList: \n"+arrayList);

        System.out.println("Reverse list using LinkedList: \n" + linkedList);
    }
}
