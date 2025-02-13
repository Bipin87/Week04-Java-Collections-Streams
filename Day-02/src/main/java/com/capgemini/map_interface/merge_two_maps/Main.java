package com.capgemini.map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create the maps and insert key-value pair
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Call the method and store result
        Map<String, Integer> mergedMap = MergeTwoMaps.mergeMaps(map1, map2);
        // Display the results
        System.out.println("Merged Map: " + mergedMap);
    }
}
