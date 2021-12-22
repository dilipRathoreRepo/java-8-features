package com.diliprathore.java.parallel_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamBoxedExample {
    public static void main(String[] args) {
        // IntStream to List
        List<Integer> integerList = IntStream.rangeClosed(1, 1000)
                .boxed()
                .collect(Collectors.toList());

        // List to Stream
        Stream<Integer> integerStream = integerList.stream().limit(5);
    }
}
