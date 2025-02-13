package com.capgemini.set_interface.union_and_intersection_two_sets;

import java.util.HashSet;
import java.util.Set;

public class TwoSets {

    // Generic method to perform union operation in two sets
    public static <T> Set<T> unionOperation(Set<T> setFirst,Set<T> setSecond){
        for(T data : setSecond){
            setFirst.add(data);
        }
        return setFirst;
    }
    // Generic method to perform intersection operation in two sets
    public static <T> Set<T> intersectionOperation(Set<T> setFirst,Set<T> setSecond){
        //create a new ans Set to store intersection of two sets
        Set<T> ans = new HashSet<>();
        for(T data : setSecond){
            if(setSecond.contains(data)){
                ans.add(data);
            }
        }
        return ans;
    }
}
