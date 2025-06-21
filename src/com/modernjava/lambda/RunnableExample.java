package com.modernjava.lambda;

public class RunnableExample {

    public static void main(String[] args) {
        // traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("traditional way: " + sum);
            }
        };
        new Thread(runnable).start();
        // lambda way
        Runnable   runnableLambda = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("lambda way: " + sum);
        };
        new Thread(runnableLambda).start();

        // lambda way - more compact
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("lambda with inner implementation way: " + sum);
        }).start();
    }
}
