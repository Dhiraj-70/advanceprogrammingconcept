package dev.dhiraj.advanceprogrammingconcept.addersubtractormethod;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 1000000; i++) {
            count.incrementCount(-i);
        }
    }
}
