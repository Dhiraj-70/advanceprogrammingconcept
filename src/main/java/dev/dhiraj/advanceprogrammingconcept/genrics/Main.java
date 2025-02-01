package dev.dhiraj.advanceprogrammingconcept.genrics;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.setFirst("Hello");
        pair1.setSecond(3);

        Pair<Double, Double> pair2 = new Pair<>();
        pair2.setFirst(3.0);
        //pair2.setSecond("Ds"); //compile time safety



    }
}
