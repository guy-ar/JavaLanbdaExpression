package com.modernjava.lambda;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (s1, s2) -> {
            if (s1 == null && s2 == null) {
                return null;
            } else if (s1 == null) {
                return s2;
            } else if (s2 == null) {
                return s1;
            }
            return s1 + " " + s2;
        };
        System.out.println(concatenateInterface.concatenate("Hello", "World"));
    }
}
