package com.capgemini.queue_interface.generate_binary_number_using_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumberGenerate {

    // Method to generate the first N binary numbers
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            result.add(binary);

            // Generate the next two binary numbers
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }
}
