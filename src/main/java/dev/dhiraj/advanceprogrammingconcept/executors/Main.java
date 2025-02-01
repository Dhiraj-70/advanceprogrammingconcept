package dev.dhiraj.advanceprogrammingconcept.executors;

import dev.dhiraj.advanceprogrammingconcept.executors.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();//newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++){
            if(i == 5 || i == 10 || i == 55 || i == 95){
                System.out.println("Debug");
            }
            NumberPrinter printer = new NumberPrinter(i);
            executor.execute(printer);
        }
    }
}
