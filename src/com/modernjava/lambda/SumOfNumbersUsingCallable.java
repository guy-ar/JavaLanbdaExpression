package com.modernjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();
    public static void main(String[] args) throws InterruptedException {
        // implement 5 callables using lambda expression
        Callable<Integer> callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length/5; i++)
                sum += array[i];
            return sum;
        };

        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = array.length/5; i < array.length*2/5; i++)
                sum += array[i];
            return sum;
        };

        Callable<Integer> callable3 = () -> {
            int sum = 0;
            for (int i = array.length*2/5; i < array.length*3/5; i++)
                sum += array[i];
            return sum;
        };

        Callable<Integer> callable4 = () -> {
            int sum = 0;
            for (int i = array.length*3/5; i < array.length*4/5; i++)
                sum += array[i];
            return sum;
        };

        Callable<Integer> callable5 = () -> {
            int sum = 0;
            for (int i = array.length*4/5; i < array.length; i++)
                sum += array[i];
            return sum;
        };
        // create ExecutorService with fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // create task list
        List<Callable<Integer>> callablesList = Arrays.asList(callable1, callable2, callable3, callable4, callable5);
        // submit callables to executorService
        List<Future<Integer>> futuresList = executorService.invokeAll(callablesList); // invokeAll returns List<Future>
        // get results from futures
        int sum = 0;
        int k = 0;
        for (Future<Integer> future : futuresList) {
            try {
                sum += future.get();
                System.out.println("Sum " + k++ + " of numbers: " + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Total sum of numbers: " + total);
        executorService.shutdown(); // shutdown executorService
    }
}
