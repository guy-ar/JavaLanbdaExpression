package com.modernjava.lambda;

public class HelloWorldLLambda  {
    public static void main(String[] args) {
        // the class will not implement the interface, instead we will create a lambda
        // that will implement the interface - it is possible as long as the interface
        // has only one abstract method
//        HelloWorldInterface helloWorldInterface = () -> {
//            return "Hello World";
//        };
        // in case of one line we can remove the brackets and return
        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }

}
