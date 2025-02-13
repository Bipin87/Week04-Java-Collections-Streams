package com.capgemini.set_interface.check_two_set_equals;

import java.util.Set;

public class CheckTwoSetEquals {
    // Generic method to check the Sets are equals or not
    public static <T> boolean checkTwoSet(Set<T> setFirst, Set<T> setSecond){
        int count = 0;
        for(T data : setFirst){
            if(setSecond.contains(data)){
                count++;
            }

        }
        if(count == setFirst.size()) {
            return true;
        }
        return false;
    }
}
