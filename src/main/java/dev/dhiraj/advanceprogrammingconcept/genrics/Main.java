package dev.dhiraj.advanceprogrammingconcept.genrics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.setFirst("Hello");
        pair1.setSecond(3);

        Pair<Double, Double> pair2 = new Pair<>();
        pair2.setFirst(3.0);
        //pair2.setSecond("Ds"); //compile time safety

        //RAW Types before Java 5
        HashMap hashMap = new HashMap();
        hashMap.put("Hello", 1);
        hashMap.put("Good", "Morning"); // no compile time safety

        //After Java 5 -> genrics were launched..
        HashMap<String, Integer> hm = new HashMap();
        hm.put("Aayush", 1);
        hm.put("Aayushi", 2);
        hm.put("Roshan", 3);
        //hm.put("Dayush", "fayush"); // compile time check
        // Java always maintain Backward Compatibility

        //At the end, when the appilcation starts everythings will be in the form of list


        List<String> name = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        // this property is known as type erasor,
        // every data type will be erased during runtime, every thing will be converted into
        // normal list, normal hashnap without data types.

        Pair.doSomething("Hero");
        Pair pair3 = new Pair();
        pair3.doSomethingElse(3);
    }
}
