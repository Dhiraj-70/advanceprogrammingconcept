package dev.dhiraj.advanceprogrammingconcept.executors;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println(num+"- Printed by Thread " + Thread.currentThread().getName());
    }

    int num;
    public NumberPrinter(int num) {
        this.num = num;
    }

}
