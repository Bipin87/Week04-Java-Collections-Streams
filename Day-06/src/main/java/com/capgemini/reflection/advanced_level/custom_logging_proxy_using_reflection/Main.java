package com.capgemini.reflection.advanced_level.custom_logging_proxy_using_reflection;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greet();

        // create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greet.class.getClassLoader(),
                new Class[] {Greeting.class},
                new LoggingInvocationHandler(greet)
        );

        proxyInstance.sayHello();
        proxyInstance.sayGoodBye("Bipin Kumar Sahu");
    }
}