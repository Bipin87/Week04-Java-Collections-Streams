package com.capgemini.set_interface.symmetric_difference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> findDifference(Set<T> set1, Set<T> set2){

        //Create a Set to store difference of both sets
        Set<T> ans = new HashSet<>(set1);
        //Remove all the elements of set2 from ans
        ans.removeAll(set2);
        //Remove all the elements of set1 from set2
        set2.removeAll(set1);

        //Add all the elements of set2 to the ans set
        ans.addAll(set2);


        return ans;
    }
}
