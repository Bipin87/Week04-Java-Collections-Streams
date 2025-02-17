package com.capgemini.reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

public class Reflection {
    // Method to modify/update the private field
    public static void setPrivateField(Object object, String fieldName, Object value) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    }
    // Method to retrieve the private field
    public static Object getPrivateField(Object object, String fieldName) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(object);
    }
}
