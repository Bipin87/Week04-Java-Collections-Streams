package com.capgemini.exception_handling.exception_propagation_in_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropagationTest {
    ExceptionPropagation exception = new ExceptionPropagation(5);
    @Test
    public void test(){
        assertThrows(ArithmeticException.class,()-> exception.method2());
        System.out.println("Exception occurs in method1 but handled in method2");
    }

}