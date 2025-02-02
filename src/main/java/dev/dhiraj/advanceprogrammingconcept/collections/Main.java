package dev.dhiraj.advanceprogrammingconcept.collections;

import java.util.*;

public class Main {
    public static void main (String[] args){
        //List Interface
        List<Integer> list = new ArrayList<>(); // LinkedList, Vector
        list.add(44);
        list.add(1);
        list.add(2);
        list.add(33);
        list.add(44);

        System.out.println("list size: "+list.size());
        for(Integer l : list){
            System.out.print(l+" ");
        }
        System.out.println("\n2nd index element: "+list.get(1));

        //Set Interface
        Set<String> set = new HashSet<>();//LinkedHashSet, TreeSet
        set.add("India");
        set.add("China");
        set.add("France");
        set.add("USA");
        set.add("India");
        set.add("China");
        set.add(null);//NullPointerException if TreeSet is uesd for Obj Creation
        set.add(null);

        System.out.println("\nset size: "+set.size());
        for(String s : set){
            System.out.print(s+" ");
        }
        System.out.println("Queue Interface");
        //Queue
        Car car1 = new Car("A", 5555, 120);
        Car car2 = new Car("B", 10000, 60);
        Car car3 = new Car("C", 555555, 340);
        Car car4 = new Car("D", 52321, 690);
        Car car5 = new Car("E", 55, 10);
        Car car6 = new Car("F", 365, 2460);


        Queue<Car> queue = new PriorityQueue<>();
        queue.add(car1);
        queue.add(car2);
        queue.add(car3);
        queue.add(car4);
        queue.add(car5);
        queue.add(car6);
        while(!queue.isEmpty()){
            System.out.println(queue.poll().toString());
        }
    }


}
