package com.capgemini.list_interface.find_nth_element_from_the_end;

import java.util.Iterator;
import java.util.List;

public class FindElement {
    // Generics Method to find the nth element form end side of list
    public static <T> T findNthElementEnd(List<T> list, int position){
        if (list == null || position <= 0) return null;


        var first = list.listIterator();
        var second = list.listIterator();

        for (int i = 0; i < position; i++) {
            if (!first.hasNext()) return null;
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}
