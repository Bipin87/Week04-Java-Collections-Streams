package com.capgemini.reflection.intermediate_level.dynamic_method_invokation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        MathOperations operations = new MathOperations();
        Class<?> cls = operations.getClass();

        // Access public methods
        Method method = cls.getDeclaredMethod("add", int.class, int.class);
        Method method1 = cls.getMethod("subtract", int.class, int.class);
        Method method2 = cls.getMethod("multiply", int.class, int.class);


        // Invoke method dynamically
        int result = (int) method.invoke(operations, 52, 10);
        int result1 = (int) method1.invoke(operations, 31, 10);
        int result2 = (int) method2.invoke(operations, 5, 10);

        System.out.println("Addition Result: " + result);
        System.out.println("Subtract Result: " + result1);
        System.out.println("Multiply Result: " + result2);
    }

}
