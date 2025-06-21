package com.modernjava.functionalproramming;

import java.util.function.Consumer;

public class ConsumerNamedClass implements Consumer<String> {
    @Override
    public void accept(String msg) {
        System.out.println("The message is: " + msg);
    }
}
