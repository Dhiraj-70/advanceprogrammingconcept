package dev.dhiraj.advanceprogrammingconcept.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> oddNum = new ArrayList<>();
        for(Integer i : numbers) {
            if( i % 2 != 0){
                oddNum.add(i);
            }
        }
        System.out.println(oddNum);

        //using stream
        List<Integer> oddNum1 = numbers.stream().filter((x) -> x % 2 != 0).toList();
        System.out.println(oddNum1);

        //Working of stream
        //List converted to Stream.
        //Stream will loop over the elements in the list
        //Every element will be passed in the filter method.
        //lambda function will be applied over each element.
        //if lambda expression return true, only that elements will be added to the streams and converted back to list
    }
}
