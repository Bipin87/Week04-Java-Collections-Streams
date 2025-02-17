package com.capgemini.reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Person class object
            Person person = new Person(21);

            // Display the original age
            System.out.println("Original age via getAge method : " + person.getAge());

            // Method to set the private field value using Refection
            Reflection.setPrivateField(person,"age",24);
            // Method to get the private field using refection
            int age = (int)Reflection.getPrivateField(person,"age");
            // Display the updated age
            System.out.println("Updated age via getAge: " + person.getAge());
            System.out.println("Updated age via Reflection: " + age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
