package com.capgemini.map_interface.find_key_with_highest_value;

import java.util.Collections;
import java.util.Map;

public class FindHighestValue {
    // Method to find the key with the maximum value in a given map
    public static String findMaxKey(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null;
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
