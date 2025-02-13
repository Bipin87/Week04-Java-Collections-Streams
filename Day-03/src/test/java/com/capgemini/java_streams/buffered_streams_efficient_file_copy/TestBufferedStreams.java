package com.capgemini.java_streams.buffered_streams_efficient_file_copy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBufferedStreams {
    FileCopy fileHandler = new FileCopy();

    String sourceFile = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/LargeFile.txt";
    String destFileUnbuffered = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/Unbuffered.txt";
    String destFileBuffered = "src/main/java/com/capgemini/java_streams/buffered_streams_efficient_file_copy/Buffered.txt";

    @Test
    public void testFirst(){
        fileHandler.copyFileUnbuffered(sourceFile, destFileUnbuffered);

        fileHandler.copyFileUnbuffered(sourceFile, destFileBuffered);
        assertNotEquals(destFileUnbuffered,destFileBuffered);
    }

}