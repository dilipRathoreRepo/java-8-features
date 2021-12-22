package com.diliprathore.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    static Function<String, String> function = String::toUpperCase;
    static List<String> arr = Arrays.asList("dilip", "rathore", "singh");

    public static void main(String[] args) {
        System.out.println(function.apply("dilip rathore"));
        List<String> newList = arr.stream().map(function).collect(Collectors.toList());
        System.out.println(newList);
    }
}
