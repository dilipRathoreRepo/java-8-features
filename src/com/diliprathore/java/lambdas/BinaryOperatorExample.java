package com.diliprathore.java.lambdas;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println(binaryOperator.apply(3, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        BinaryOperator<Integer> binaryMaxBy = BinaryOperator.maxBy(comparator);

        System.out.println(binaryMaxBy.apply(3, 5));
    }
}
