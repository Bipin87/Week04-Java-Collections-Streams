package com.capgemini.exception_handling.nested_try_catch_blocks;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.nested_try_catch_blocks.NestedTryCatchBlock.divideElementOnIndex;
import static org.junit.jupiter.api.Assertions.*;

class NestedTryCatchBlockTest {
    @Test
    void testFirst(){
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> divideElementOnIndex(new int[]{1,2,3,4}, 2, 5));
    }

    @Test
    void testSecond(){
        assertEquals(1,divideElementOnIndex(new int[]{1,2,3,4}, 2, 1));
    }

    @Test
    void testThird(){
        assertThrows(ArithmeticException.class, ()-> divideElementOnIndex(new int[]{1,2,3,4}, 0, 1));
    }

}