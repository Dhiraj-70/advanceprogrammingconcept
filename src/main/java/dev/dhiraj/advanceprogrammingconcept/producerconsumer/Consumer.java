package dev.dhiraj.advanceprogrammingconcept.producerconsumer;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;

    Consumer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            if (store.size() > 0) {
                System.out.println("Consumer "+ this.name+" has consumed the shirt, size store: "+ this.store.size());
                store.remove();
            }
        }
    }
}
