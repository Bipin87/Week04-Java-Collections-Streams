package com.capgemini.exception_handling.exception_propagation_in_method;

public class Main {
    public static void main(String[] args) {
        int num=10;
        try{
            ExceptionPropagation exception=new ExceptionPropagation(num);
            exception.method2();
        }
        catch(ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
