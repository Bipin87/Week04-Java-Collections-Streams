package com.capgemini.reflection.basic_level.invoke_private_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokePrivateMethodTest {
    @Test
    public void testInvokePrivateMethod() throws Exception{
        Calculator calculator = new Calculator();
        int result = (int) Reflection.invokePrivateMethod(calculator,"multiply",new Class[]{int.class,int.class},10,5);
        assertEquals(50,result);

    }

}