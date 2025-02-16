package com.capgemini.reflection.basic_level.get_class_information;

import org.junit.jupiter.api.Test;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

class ReflectionClassTest {

    @Test
    void testGetClassInfo() throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        assertNotNull(cls);

        Method[] methods = cls.getDeclaredMethods();
        assertNotNull(methods);

        Field[] fields = cls.getDeclaredFields();
        assertNotNull(fields);

        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        assertNotNull(constructors);
    }

}