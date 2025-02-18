package com.capgemini.reflection.advanced_level.generate_json_representation;


public class Person {
    private String name;
    private int age;
    private boolean accessible;

    public Person(String name, int age, boolean accessible) {
        this.name = name;
        this.age = age;
        this.accessible = accessible;
    }

    @Override
    public String toString(){
        return "Person: " + name +" ,Age: " + age + ",Accessible: " + accessible;
    }
}