package com.capgemini.map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    // Method to merge two maps and sum values of common keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}
