package com.capgemini.java_streams.read_large_file_line_by_line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/capgemini/java_streams/read_large_file_line_by_line/largeFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
            System.out.println("Read large file successfully");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

