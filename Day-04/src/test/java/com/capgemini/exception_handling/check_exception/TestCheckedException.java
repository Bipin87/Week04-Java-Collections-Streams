package com.capgemini.exception_handling.check_exception;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.check_exception.IOExceptionClass.exceptionHandle;
import static org.junit.jupiter.api.Assertions.*;

class TestCheckedException {
    @Test
    public void testFirst(){
        String filePath = "text.txt";
        exceptionHandle(filePath);
        assertEquals("File Not Found",exceptionHandle(filePath));
    }
    @Test
    public void testSecond(){
        String filePath = "src/main/java/com/capgemini/exception_handling/check_exception/file.txt";

        exceptionHandle(filePath);
        assertFalse(filePath.isEmpty());
    }

}