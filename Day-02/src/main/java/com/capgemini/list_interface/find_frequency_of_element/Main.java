package com.capgemini.list_interface.find_frequency_of_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.list_interface.find_frequency_of_element.FrequencyElement.frequency;

public class Main {
    public static void main(String[] args) {
        // Create the object of List interface and call the method
        List<String> list = new ArrayList<>(Arrays.asList("Apple","Mango","Apple","Grapes","Banana"));
        frequency(list);
        List<Integer> intValues = new ArrayList<>(Arrays.asList(1,2,3,3,42,1,3));
        frequency(intValues);
    }
}
