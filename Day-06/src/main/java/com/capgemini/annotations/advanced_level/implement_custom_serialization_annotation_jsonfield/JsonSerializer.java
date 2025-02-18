package com.capgemini.annotations.advanced_level.implement_custom_serialization_annotation_jsonfield;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class JsonSerializer {
    public static String serialize(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, String> jsonMap = new HashMap<>();
        
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj).toString());
            }
        }
        
        return jsonMap.toString().replace("=", ":").replace("{", "{").replace("}", "}");
    }
}