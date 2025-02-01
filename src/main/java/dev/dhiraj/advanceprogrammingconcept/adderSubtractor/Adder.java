package dev.dhiraj.advanceprogrammingconcept.adderSubtractor;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            count.value = count.value + i;
        }
    }
}
