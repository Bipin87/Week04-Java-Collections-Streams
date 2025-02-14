package com.capgemini.exception_handling.multiple_catch_blocks;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.multiple_catch_blocks.MultipleCatchBlocks.multipleCatch;
import static org.junit.jupiter.api.Assertions.*;

class TestMultipleCatch {
    int[]array={2,4,5,1};
    int[]nums=null;
    @Test
    public void testIndexOutOfBoundsException(){
        assertEquals("Invalid index! Index 4 out of bounds for length 4",multipleCatch(array,4));
    }
    @Test
    public void testNullPointerException(){
        
        assertEquals("Array is not initialized! Cannot read the array length because \"array\" is null",multipleCatch(nums,0));

    }
    @Test
    public void testValidCase(){
        int index=2;
        assertEquals("Value at index X: " +array[index],multipleCatch(array,index));
    }

}