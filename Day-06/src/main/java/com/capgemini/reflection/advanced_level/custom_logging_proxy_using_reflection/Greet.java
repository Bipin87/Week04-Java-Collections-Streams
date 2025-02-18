package com.capgemini.reflection.advanced_level.custom_logging_proxy_using_reflection;

public class Greet implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.println("Good bye " + name );
    }
    // Concrete method of the abstract methods

}