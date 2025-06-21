package com.modernjava.lambda;

public class ConcatenateTraditional implements ConcatenateInterface {
    @Override
    public String concatenate(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return null;
        } else if (s1 == null) {
            return s2;
        } else if (s2 == null) {
            return s1;
        } else
            return s1 + s2;
    }
    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.concatenate(null, "World"));
    }
}
