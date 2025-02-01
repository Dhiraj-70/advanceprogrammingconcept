package dev.dhiraj.advanceprogrammingconcept.addersubtractorsync;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            synchronized (Count.class){
                count.value = count.value + i;
            }
        }
    }
}
