package com.modernjava.lambda;

public class IncrementByFiveTraditional implements IncrementByFileInterface {
    @Override
    public int incrementByFile(int number) {
        return number + 5;
    }
    public static void main(String[] args) {
        IncrementByFileInterface incrementByFileInterface = new IncrementByFiveTraditional();
        System.out.println(incrementByFileInterface.incrementByFile(10));
    }
}
