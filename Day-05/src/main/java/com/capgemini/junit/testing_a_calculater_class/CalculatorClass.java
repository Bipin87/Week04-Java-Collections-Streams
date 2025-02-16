package com.capgemini.junit.testing_a_calculater_class;

public class CalculatorClass {
    //method for addition
    public static int add(int a, int b){
        return a+b;
    }

    //method for multiplication
    public static int multiply(int a, int b){
        return a*b;
    }

    //method for divide
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    //method for subtract
    public static int subtract(int a, int b){
        return a-b;
    }
}
