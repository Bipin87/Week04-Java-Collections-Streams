package com.capgemini.reflection.advanced_level.generate_json_representation;

import java.lang.reflect.Field;

public class JsonConvertor {
    // Method to convert into json
    public static String toJson(Object obj){
        // If the object is null
        if (obj == null) return null;

        StringBuilder jsonBuilder = new StringBuilder();
        // append the initial braces
        jsonBuilder.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        int fieldCount = 0;
        for (Field field : fields) {
            field.setAccessible(true);
            try{
                Object value = field.get(obj);
                jsonBuilder.append("\"").append(field.getName()).append("\":");
                jsonBuilder.append(formatValue(value));
                fieldCount++;
                if (fieldCount < fields.length) jsonBuilder.append(", ");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    private static String formatValue(Object value) {
        if (value instanceof String) {
            // Enclose strings in quotes
            return "\"" + value + "\"";
        } else if (value instanceof Boolean || value instanceof Number) {
            return value.toString();
        } else if (value == null) {
            return "null";
        }
        return "\"" + value.toString() + "\"";
    }
}