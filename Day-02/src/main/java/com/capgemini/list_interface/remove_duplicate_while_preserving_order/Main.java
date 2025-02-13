package com.capgemini.list_interface.remove_duplicate_while_preserving_order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.remove_duplicate_while_preserving_order.RemoveDuplicate.removeDuplicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,2,1,4,3,5));
        // Call a method and store the unique data list
        List<Integer> resultList = removeDuplicate(list);
        // Display the updated list
        System.out.println("After remove duplicate data in list is: "+resultList);
    }
}
