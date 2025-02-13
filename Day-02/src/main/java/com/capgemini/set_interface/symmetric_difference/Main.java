package com.capgemini.set_interface.symmetric_difference;

import com.capgemini.set_interface.union_and_intersection_two_sets.TwoSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.capgemini.set_interface.symmetric_difference.SymmetricDifference.findDifference;

public class Main {
    public static void main(String[] args) {
        //Create the object of set interface
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Your symmetric difference of set are: "+findDifference(set1,set2));

    }

}
