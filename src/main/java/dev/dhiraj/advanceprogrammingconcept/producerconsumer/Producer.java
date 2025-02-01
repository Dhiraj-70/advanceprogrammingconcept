package dev.dhiraj.advanceprogrammingconcept.producerconsumer;

import java.util.Objects;
import java.util.Queue;

public class Producer implements Runnable {
    private int maxSize;
    private Queue<Object> store;
    private String name;

    Producer(int maxSize, Queue<Object> store, String name) {
        this.maxSize = maxSize;
        this.store = store;
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            if (store.size() < maxSize) {
                System.out.println("Producer "+ this.name+" has Produced the shirt, size store: "+ this.store.size());
                store.add(new Object());
            }
        }
    }
}
