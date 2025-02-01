package dev.dhiraj.advanceprogrammingconcept.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private int maxSize;
    private Queue<Object> store;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(int maxSize, Queue<Object> store, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.maxSize = maxSize;
        this.store = store;
        this.name = name;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }
    @Override
    public void run() {
        while (true) {
                try {
                    producerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Producer "+ this.name+" has Produced the shirt, size store: "+ this.store.size());
                store.add(new Object());
                consumerSemaphore.release();
        }
    }
}
