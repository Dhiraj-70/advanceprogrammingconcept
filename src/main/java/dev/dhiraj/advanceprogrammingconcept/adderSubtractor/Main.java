package dev.dhiraj.advanceprogrammingconcept.adderSubtractor;

import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);

    }
}
