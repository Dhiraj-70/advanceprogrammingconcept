package dev.dhiraj.advanceprogrammingconcept.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executor;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }
    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1){
            return arrayToSort;
        }

        //Divide array into 2 parts
        int middle = arrayToSort.size() / 2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        for (int i = 0; i < middle; i++) {
            leftArray.add(arrayToSort.get(i));
        }
        for (int i = middle; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }
        //sort leftArray and rightArray on 2 different threads.

        MergeSorter leftSorter = new MergeSorter(leftArray, executor);
        MergeSorter rightSorter = new MergeSorter(rightArray, executor);

        //Create Executor i.e Thread and assign Task i.e (MergeSorter) obj
//        ExecutorService executor = Executors.newCachedThreadPool();
        Future<List<Integer>> futureLeftSortedArray = executor.submit(leftSorter);
        Future<List<Integer>> futureRightSortedArray = executor.submit(rightSorter);

        List<Integer> sortedArray = new ArrayList<>();
        //Here when we need the data, we call gat(). get() may be a blocking call because if till the time if the data has not been sorted, then we have to wait.
        List<Integer> leftSortedArray = futureLeftSortedArray.get();
        List<Integer> rightSortedArray = futureRightSortedArray.get();
        int i = 0, j = 0;
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortedArray;
    }
}
