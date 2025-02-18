package com.capgemini.reflection.advanced_level.create_a_custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the given class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate through map entries and set fields
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    // Get the field from the class
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true); // Allow access to private fields

                    // Set the field value
                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Warning: No such field '" + fieldName + "' in class " + clazz.getSimpleName());
                }
            }

            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
