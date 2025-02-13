package com.capgemini.java_streams.file_handling_read_and_write_text_file;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFileHandling {
    FileHandling fileHandler = new FileHandling();

    // Define source and destination file paths
    String sourceFile = "src/main/java/com/capgemini/java_streams/file_handling_read_and_write_text_file/Source.txt";
    String destinationFile = "src/main/java/com/capgemini/java_streams/file_handling_read_and_write_text_file/Destination.txt";

    @Test
    public void testFirst(){
        fileHandler.copyFile(sourceFile, destinationFile);
        assertEquals("src/main/java/com/capgemini/java_streams/file_handling_read_and_write_text_file/Destination.txt",destinationFile);
    }
    @Test
    public void testSecond(){
        fileHandler.copyFile(sourceFile,destinationFile);
        assertNotEquals(sourceFile,destinationFile);
    }

}