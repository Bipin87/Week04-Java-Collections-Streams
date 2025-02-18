package com.capgemini.reflection.advanced_level.generate_json_representation;

import static com.capgemini.reflection.advanced_level.generate_json_representation.JsonConvertor.toJson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bipin",21,true);
        String json = toJson(person);

        System.out.println(json);
    }
}