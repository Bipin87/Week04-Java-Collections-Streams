package com.capgemini.exception_handling.throw_vs_throws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExceptionPropagation {
    @Test
    void calculateInterestTest1(){
        assertThrows(IllegalArgumentException.class, ()-> ExceptionPropagation.calculateInterest(-7000,8,3));
    }

    @Test
    void calculateInterestTest2(){
        assertEquals(5040,ExceptionPropagation.calculateInterest(7000, 9, 8));
    }

}