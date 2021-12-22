package com.diliprathore.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateFactoryMethods {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Adam", "Dan");

        // iterate
        System.out.println("Checking iterate function");
        Stream.iterate(1, x -> x*2).limit(10).forEach(System.out::println);

        // generate
        System.out.println("Checking generate function");
        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }
}
