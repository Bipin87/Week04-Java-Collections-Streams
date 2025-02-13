package com.capgemini.set_interface.convert_set_to_sorted_list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.capgemini.set_interface.convert_set_to_sorted_list.ConvertSet.convertSortedList;

public class Main {
    public static void main(String[] args) {
        // Create the object of set interface
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 2, 8, 1, 3));

        // Call the method and store in list
        List<Integer> sortedList = convertSortedList(set);

        // Display result
        System.out.println("Our sorted List is: " + sortedList);
    }
}
