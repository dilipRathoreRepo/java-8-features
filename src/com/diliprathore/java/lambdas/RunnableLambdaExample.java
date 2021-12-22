package com.diliprathore.java.lambdas;

import java.util.Comparator;

public class RunnableLambdaExample {
    public static void main(String[] args) {
//        Runnable runnable =  new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running this..");
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        Thread thread = new Thread(() -> System.out.println("running this"));
//        thread.start();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(3, 4));

        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println(comparator1.compare(5, 9));

    }
}