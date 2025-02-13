package com.capgemini.set_interface.find_subsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.find_subsets.FindSubsets.checkIfSubset;

public class Main {
    public static void main(String[] args) {
        // Create the sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));

        // Call the method and store its value
        boolean result = checkIfSubset(set1,set2);

        // Display result
        System.out.println("Return the set1 subset of set2: "+ result);
    }
}
