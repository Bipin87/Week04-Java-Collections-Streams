package com.capgemini.list_interface.remove_duplicate_while_preserving_order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    // Generic method to remove duplicate data
    public static <T> List<T> removeDuplicate(List<T> list){
        // Create the objects
        Set<T>uniqueElement = new HashSet<>();
        List<T>resultList = new ArrayList<>();
        for(T data : list){
            if(!uniqueElement.contains(data)){
                uniqueElement.add(data);
                resultList.add(data);
            }
        }

        return resultList;
    }
}
