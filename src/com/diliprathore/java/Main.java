package com.diliprathore.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    static List<Integer> integerList = Arrays.asList(1,2,3,4,5);
    static Predicate<Integer> isEven = n -> n % 2 == 0;
    static Predicate<Integer> isOdd = n -> n % 2 != 0;

    static Consumer<Integer> integerConsumer = i -> integerList.add(i);

    static Function<List<Integer>, List<Integer>> evenNumbersListFunction = numbers -> {
        List<Integer> evenNumbers = new ArrayList<>();

        numbers.forEach(number -> {
            if (isEven.test(number)) {
                evenNumbers.add(number);
            }
        });
        return evenNumbers;
    };

    public static void main(String[] args) {
        System.out.println("Is 4 an even number? -> " + isEven.test(4));
        System.out.println("Is 4 an odd number? -> " + isOdd.test(4));

//        System.out.println("Add only even number to the list");
//        if (isEven.test(14)) {
//            integerConsumer.accept(14);
//        }

        System.out.println("Printing only even numbers using Function<Integer>");
        System.out.println(evenNumbersListFunction.apply(integerList));
    }
}
