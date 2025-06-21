package com.modernjava.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFileInterface incrementByFileInterface = (number) -> number + 5;
        System.out.println(incrementByFileInterface.incrementByFile(10));
    }
}
