package com.capgemini.reflection.basic_level.access_private_field;

public class Person {
    // Declare attribute as private
    private int age;

    // Parameterized constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter to get the person age
    public int getAge() {
        return age;
    }
}
