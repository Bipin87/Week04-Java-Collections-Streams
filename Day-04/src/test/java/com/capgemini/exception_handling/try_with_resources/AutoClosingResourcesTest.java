package com.capgemini.exception_handling.try_with_resources;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.try_with_resources.AutoClosingResources.readFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AutoClosingResourcesTest {
    @Test
    public void testFirst(){
        String filePath = "text.txt";
        readFile(filePath);
        assertEquals("Error reading file",readFile(filePath));
    }
    @Test
    public void testSecond(){
        String filePath = "src/main/java/com/capgemini/exception_handling/try_with_resources/file.txt";

        readFile(filePath);
        assertFalse(filePath.isEmpty());
    }

}