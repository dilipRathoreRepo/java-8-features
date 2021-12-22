package com.diliprathore.java.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UrinaryOperatorExample {
    static UnaryOperator<String> unaryOperator = s -> s.concat("Default");
//    static Function<String, String> function = s -> s.concat("Default-using-function");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("abc-"));
//        System.out.println(function.apply("abc-"));
    }
}
