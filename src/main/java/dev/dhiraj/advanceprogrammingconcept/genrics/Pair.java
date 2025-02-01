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

    //Static method.. this method can be called without object creation.. So need to add some syntatic suger
    public static <A> void doSomething(A data){
        System.out.println("doSomething");
    }

    //Non-static method.. so Data type will get defined at object creation
    public void doSomethingElse(K data){
        System.out.println("doSomethingElse");
    }
}
