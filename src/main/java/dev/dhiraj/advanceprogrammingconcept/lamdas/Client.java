package dev.dhiraj.advanceprogrammingconcept.lamdas;

import java.util.function.BiConsumer;

public class Client {
    public static void main(String[] args) {
        //way 1
        SampleClass sampleClass = new SampleClass();
        sampleClass.fun1();

        //way 2 - Anonymous Class
        SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymous Class");
            }
        };
        sampleFunctionalInterface.fun1();

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String name, Integer num) {
                System.out.println(name + " sorerd " + num+" marks");
            }
        };
        biConsumer.accept("Rupak", 99);
        biConsumer.accept("Chandan", 87);
    }
}
