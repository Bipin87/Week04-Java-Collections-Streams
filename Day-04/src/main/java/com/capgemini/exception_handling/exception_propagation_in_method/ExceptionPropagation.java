package com.capgemini.exception_handling.exception_propagation_in_method;

public class ExceptionPropagation {
    // Declare a attribute
    private int num;
    //Parameterized constructor
    ExceptionPropagation(int num){
        this.num=num;
    }

    //Getter to get
    public int getNum() {
        return num;
    }

    public  void method1(){
        int result=num/0;
    }
    public void method2(){
        method1();
    }
}
