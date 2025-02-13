package com.capgemini.map_interface.word_frequency_counter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Store the file path
        String filename = "src/main/java/com/capgemini/map_interface/word_frequency_counter/Words.txt";
        // Call method and store its values
        Map<String, Integer> wordFrequencies = WordFrequencyCount.countWordFrequencies(filename);

        // Display result
        System.out.println("Word Frequencies: " + wordFrequencies);
    }
}
