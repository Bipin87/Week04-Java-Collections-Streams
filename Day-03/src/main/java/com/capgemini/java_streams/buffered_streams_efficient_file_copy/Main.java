package com.capgemini.java_streams.buffered_streams_efficient_file_copy;

public class Main {
    public static void main(String[] args) {
        FileCopy fileHandler = new FileCopy();

        String sourceFile = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/LargeFile.txt";
        String destFileUnbuffered = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/Unbuffered.txt";
        String destFileBuffered = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/Buffered.txt";

        System.out.println("Starting unbuffered copy...");
        fileHandler.copyFileUnbuffered(sourceFile, destFileUnbuffered);

        System.out.println("Starting buffered copy...");
        fileHandler.copyFileBuffered(sourceFile, destFileBuffered);
    }
}
