package com.capgemini.list_interface.find_frequency_of_element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyElement {

    // Method to find the maximum frequency of element
    public static <T> void frequency(List<T> list){
        // Create the object of Map interface and add the data of list
        Map<T,Integer> map = new HashMap<>();
        for(int i =0; i < list.size(); i++){
            if(map.isEmpty()){
                map.put(list.get(i),1);

            }
            else if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1 );
            }
            else{
                map.put(list.get(i),1);
            }
        }
        // Display the Map
        System.out.println("Display the each data with frequency:\n"+map);

    }
}
