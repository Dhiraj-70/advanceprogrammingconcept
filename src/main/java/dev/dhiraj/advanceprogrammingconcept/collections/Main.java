package dev.dhiraj.advanceprogrammingconcept.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main (String[] args){
        List<Integer> list = new ArrayList<>(); // LinkedList, Vector
        list.add(44);
        list.add(1);
        list.add(2);
        list.add(33);
        list.add(44);

        System.out.println("size: "+list.size());
        for(Integer l : list){
            System.out.print(l+" ");
        }

    }
}
