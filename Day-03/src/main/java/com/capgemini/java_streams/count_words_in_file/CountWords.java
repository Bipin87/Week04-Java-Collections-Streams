package com.capgemini.java_streams.count_words_in_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {

        String filePath = "src/main/java/com/capgemini/java_streams/count_words_in_file/words.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception occur: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display the results
        System.out.println("Total unique words: " + wordCountMap.size());
        System.out.println("Display only top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
        }
    }

}
