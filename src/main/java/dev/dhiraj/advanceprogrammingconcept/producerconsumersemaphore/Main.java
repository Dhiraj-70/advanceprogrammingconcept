package dev.dhiraj.advanceprogrammingconcept.producerconsumersemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int maxSize = 6;
        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);
        Queue<Object> store = new ArrayDeque<>();

        Producer p1 = new Producer(maxSize, store, "P1", producerSemaphore, consumerSemaphore);
        Producer p2 = new Producer(maxSize, store, "P2", producerSemaphore, consumerSemaphore);
        Producer p3 = new Producer(maxSize, store, "P3", producerSemaphore, consumerSemaphore);

        Consumer c1 = new Consumer(store, maxSize, "C1", producerSemaphore, consumerSemaphore);
        Consumer c2 = new Consumer(store, maxSize, "C2", producerSemaphore, consumerSemaphore);
        Consumer c3 = new Consumer(store, maxSize, "C3", producerSemaphore, consumerSemaphore);
        Consumer c4 = new Consumer(store, maxSize, "C4", producerSemaphore, consumerSemaphore);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);
        Thread t7 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
