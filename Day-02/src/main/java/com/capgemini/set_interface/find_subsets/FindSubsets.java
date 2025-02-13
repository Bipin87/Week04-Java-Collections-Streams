package com.capgemini.set_interface.find_subsets;

import java.util.Set;

public class FindSubsets {
    //Method which check if one set is subset of another set and return boolean true/false
    public static <T>boolean checkIfSubset(Set<T> set1, Set<T> set2) {

        //Check set2 contains all element of set1
        return set2.containsAll(set1);
    }
}
