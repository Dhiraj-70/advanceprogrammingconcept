package dev.dhiraj.advanceprogrammingconcept.threads;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread printed by: " + Thread.currentThread().getName());
    }
}
