package com.capgemini.reflection.basic_level.invoke_private_method;

import java.lang.reflect.Method;

public class Reflection{
    // Method to invoke the private method of calculator class
    public static Object invokePrivateMethod(Object object,String methodName, Class<?>[] paramTypes, Object...args) throws Exception{

        Method method = object.getClass().getDeclaredMethod(methodName, paramTypes);
        method.setAccessible(true);
        return method.invoke(object, args);
    }
}
