package com.diliprathore.java.parallel_streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformance(Supplier<Integer> supplier, int iteration) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= iteration; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 100000).sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 100000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println("sumSequentialStream -> " + checkPerformance(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("sumParallelStream -> " + checkPerformance(ParallelStreamExample::sumParallelStream, 20));
    }
}
