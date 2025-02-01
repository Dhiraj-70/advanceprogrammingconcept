package dev.dhiraj.advanceprogrammingconcept.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(1, 7, 8, 4, 3, 6, 2, 9, 5, 10);
        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(numbers, executor);
        Future<List<Integer>> mergeSortedArray = executor.submit(mergeSorter);
        System.out.println(mergeSortedArray.get());
    }
}
