package com.capgemini.annotations.advanced_level.implement_custom_serialization_annotation_jsonfield;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Bipin", 21);
        String jsonString = JsonSerializer.serialize(user);
        System.out.println(jsonString);
    }
}
