package com.capgemini.set_interface.convert_set_to_sorted_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ConvertSet {
    //Method to convert set into a sorted list
    public static <T extends Comparable<T>> List<T> convertSortedList(Set<T> set){

        //Create an arrayList to store elements and store hashset elements to arraylist
        List<T> ans = new ArrayList<>(set);

        //Use built-in method to sort list
        Collections.sort(ans);
        return ans;
    }
}
