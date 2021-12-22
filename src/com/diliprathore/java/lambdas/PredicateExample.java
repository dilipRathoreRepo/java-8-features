package com.diliprathore.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static Predicate<Integer> p1 = (i) -> i % 2 == 0;
    public static  Predicate<Integer> p2 = (i) -> i % 5 == 0;
    public static List<Integer> intArr = Arrays.asList(1, 3, 5, 9);
    public static Predicate<Integer> p3 = (i) -> i % 5 == 0;
    public static Predicate<Integer> p4 = i -> i > 3;

    public static void main(String[] args) {
        predicateAnd();
        List<Integer> filteredList = intArr.stream().filter(k -> p3.and(p4).test(k)).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }

    public static void predicateAnd() {
        System.out.println("predicateAnd -> " + p1.and(p2).test(15));
        System.out.println("predicateAnd -> " + p1.and(p2).negate().test(15));
    }
}
