package com.capgemini.java_streams.file_handling_read_and_write_text_file;

public class Main {
    public static void main(String[] args) {
        FileHandling fileHandler = new FileHandling();

        // Define source and destination file paths
        String sourceFile = "src/main/java/com/capgemini/java_streams/file_handling_read_and_write_text_file/Source.txt";
        String destinationFile = "src/main/java/com/capgemini/java_streams/file_handling_read_and_write_text_file/Destination.txt";

        // Call method to copy file
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
