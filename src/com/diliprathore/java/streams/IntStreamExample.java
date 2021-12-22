package com.diliprathore.java.streams;

import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        int sumValue = IntStream.rangeClosed(1, 50).reduce(0, Integer::sum);
        System.out.println(sumValue);
    }
}
