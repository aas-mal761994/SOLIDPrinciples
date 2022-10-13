package com.core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIngExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<100;i++){
            myList.add(i);
        }

        Stream<Integer> pStream = myList.parallelStream();
        Stream<Integer> result = pStream.filter( e-> e>50);
        result.forEach(System.out::println);


        /*List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel="+p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));*/
    }
}
