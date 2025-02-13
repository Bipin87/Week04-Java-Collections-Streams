package com.capgemini.map_interface.find_key_with_highest_value;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Call the method and store value
        String maxKey = FindHighestValue.findMaxKey(inputMap);
        // Display the result
        System.out.println("Key with the highest value: " + maxKey);
    }
}
