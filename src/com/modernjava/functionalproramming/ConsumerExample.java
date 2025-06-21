package com.modernjava.functionalproramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (msg) -> System.out.println("The message is: " + msg);
        consumer.accept("hello");

        // example with block of code
        Consumer<String> consumer2 = (msg) -> {
            System.out.println("The message is: " + msg);
        };
        consumer2.accept("hello in block");
    }

}
