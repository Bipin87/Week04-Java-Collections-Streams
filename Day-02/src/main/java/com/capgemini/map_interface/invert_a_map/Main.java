package com.capgemini.map_interface.invert_a_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create object of Map and put values
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Call the method and store the result
        Map<Integer, List<String>> invertedMap = InvertMap.invertMap(inputMap);

        // Display the inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}
