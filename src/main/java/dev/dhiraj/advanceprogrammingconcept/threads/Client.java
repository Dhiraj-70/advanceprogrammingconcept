package dev.dhiraj.advanceprogrammingconcept.threads;

import dev.dhiraj.advanceprogrammingconcept.oops.Helper;

public class Client {
    public static void main(String[] args) {
        System.out.println("Thread printed by: "+ Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
    }
}
