package dev.dhiraj.advanceprogrammingconcept.lamdas;

import java.util.function.*;

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

        //Lambda Expression
        //3rd way in which we can provide the method body of an interface

        Consumer<String> consumer = (str) -> {
            System.out.println("Consumer Functional Interface-> "+str);
        };
        consumer.accept("Yes");

        BiConsumer<String, Integer> biConsumer2 = (str1, num) -> {
            System.out.println(str1 + ", " + num);
        };
        biConsumer2.accept("Rupak", 99);

        //BinaryOperator:- fun(T t1, T t2) return T
        BinaryOperator<Integer> bo = (x, y) -> {
            return x + y;
        };
        Integer sum = bo.apply(1, 2);
        System.out.println("Sum using BinaryOperator Functional Interface: "+sum);

        //Predicate
        Predicate<String> predicate = (str) -> {
            if(str.length() > 5) return true;
            return false;
        };
        System.out.println(predicate.test("Bangalore"));

        //Predicate on single line
        //Predicate
        Predicate<String> predicate1 = (str) -> str.length() > 5;
        System.out.println(predicate1.test("BAng"));


        //BiPredicate
        BiPredicate<String, Integer> bp = (str, num) -> str.length() > num;
        System.out.println(bp.test("Bangalore", 4));

    }
}
