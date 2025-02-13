package com.capgemini.set_interface.union_and_intersection_two_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.union_and_intersection_two_sets.TwoSets.intersectionOperation;
import static com.capgemini.set_interface.union_and_intersection_two_sets.TwoSets.unionOperation;

public class Main {
    public static void main(String[] args) {
        Set<String> setFirst = new HashSet<>(Arrays.asList("bipin","aman","aryan","bipin"));
        Set<String> setSecond = new HashSet<>(Arrays.asList("bipin","aman","aryan"));
        Set<String> setThird = new HashSet<>(Arrays.asList("aman"));

        // Call and display all result
        System.out.println("Union of two sets are: "+unionOperation(setFirst,setSecond));
        System.out.println("Intersection of two sets are: "+intersectionOperation(setFirst,setThird));

    }
}
