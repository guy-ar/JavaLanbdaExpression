package com.modernjava.functionalproramming;

import java.util.function.Consumer;

public class ConsumerTraditionalExample {
    // for this example we need to create a class that implements the interface Consumer
    // must override the method accept
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String msg) {
                System.out.println("The message is: " + msg);
            }
        };
        consumer.accept("hello");

        // ✅ Using a block of code in another anonymous class
        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String msg) {
                System.out.println("The message is: " + msg);
                // You can add more code here if needed
            }
        };
        consumer2.accept("hello in block");
        // this example implements the interface Consumer as separate class
        ConsumerNamedClass consumerNamedClass = new ConsumerNamedClass();
        consumerNamedClass.accept("hello with named class");
    }
}

// using Named Class for consumer
