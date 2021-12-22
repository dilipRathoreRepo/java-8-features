package com.diliprathore.java.lambdas;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a -> " + a + ", b -> " + b);
        biConsumer.accept("a", "b");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("a * b = " + (a*b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("a / b = " + (a/b));

        multiply.andThen(division).accept(10, 5);

    }
}
