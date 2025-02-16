package com.capgemini.junit.testing_a_calculater_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassTest {
    //test for addition
    @Test
    void addTest1(){
        assertEquals(7, CalculatorClass.add(4,3));
        System.out.println("✅ Test1 Passed");
    }

    //test for subtraction
    @Test
    void subtractTest2(){
        assertEquals(6, CalculatorClass.subtract(10,4));
        System.out.println("✅ Test2 Passed");
    }


    //test for multiplication
    @Test
    void multiplyTest3(){
        assertEquals(12, CalculatorClass.multiply(4,3));
        System.out.println("✅ Test3 Passed");
    }

    //test for division
    @Test
    void divisionTest4(){
        assertEquals(6, CalculatorClass.divide(24,4));
        System.out.println("✅ Test4 Passed");
    }

    //test for division
    @Test
    void divisionTest5(){
        assertThrows(ArithmeticException.class,()-> CalculatorClass.divide(4,0));
        System.out.println("✅ Test5 Passed");
    }

}