package dev.dhiraj.advanceprogrammingconcept.genrics;

public class Pair <K,L>{
    K first;
    L second;

    public void setFirst(K first) {
        this.first = first;
    }
    public void setSecond(L second) {
        this.second = second;
    }
    public K getFirst() {
        return first;
    }
    public L getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
