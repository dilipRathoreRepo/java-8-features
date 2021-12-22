package com.diliprathore.java.defaultstaticmethods;

import java.util.Arrays;
import java.util.List;

public class MultiplierImpl implements Multiplier{

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5);
        MultiplierImpl obj = new MultiplierImpl();
        System.out.println(obj.multiply(integers));

        System.out.println("Size of List 'integers' -> " + obj.size(integers));

        System.out.println("Is List of 'integers' empty? -> " + Multiplier.isEmpty(integers));
    }
}
