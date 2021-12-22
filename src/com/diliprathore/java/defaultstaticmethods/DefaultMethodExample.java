package com.diliprathore.java.defaultstaticmethods;

import java.util.*;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Dilip", "Alex", "Rathore");

//        Prior to java 8
//        Collections.sort(names);
//        System.out.println(names);

//        Java 8 - option 1
//        Comparator<String> c = String::compareTo;
//        names.sort(c);
//        System.out.println(names);

//        OR - option 2

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
