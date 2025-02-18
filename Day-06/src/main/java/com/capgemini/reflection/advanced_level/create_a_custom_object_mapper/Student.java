package com.capgemini.reflection.advanced_level.create_a_custom_object_mapper;

// Define a sample Student class
class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

}
