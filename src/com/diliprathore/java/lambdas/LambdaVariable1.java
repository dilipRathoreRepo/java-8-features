package com.diliprathore.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    static int i = 0;
    public static void main(String[] args) {

        Consumer<Integer> c1 = (k) -> {
            i++;
            System.out.println("Value of i+k is -> " + (i+k));
        };

        c1.accept(5);
    }
}
