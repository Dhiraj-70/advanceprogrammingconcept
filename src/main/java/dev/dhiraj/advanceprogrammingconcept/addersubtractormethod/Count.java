package dev.dhiraj.advanceprogrammingconcept.addersubtractormethod;

public class Count {
    private int value;

    public Count(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementCount(int i) {
        this.value = value + i;
    }
}
