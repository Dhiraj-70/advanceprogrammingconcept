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
    }
}
