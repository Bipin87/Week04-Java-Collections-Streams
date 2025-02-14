package com.capgemini.exception_handling.finally_block_exception;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.finally_block_exception.FinallyBlockException.divideOperation;
import static org.junit.jupiter.api.Assertions.*;

class FinallyBlockExceptionTest {
    @Test
    public void testFirst(){
        assertEquals("Result: "+2,divideOperation(4,2));
    }
    @Test
    public void testException(){
        assertEquals("Error: Cannot divide by zero.", divideOperation(5,0));
    }

}