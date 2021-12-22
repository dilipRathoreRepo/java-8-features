package com.diliprathore.java.stream_terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamJoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dilip", "rathore", "chanu");

//        Optional<String> result = names.stream().reduce(String::concat);
//        result.ifPresent(System.out::println);

//        String result = names.stream().collect(Collectors.joining());
//        String result = names.stream().collect(Collectors.joining("-"));
        String result = names.stream().collect(Collectors.joining("-", "(", ")"));
        System.out.println(result);

        System.out.println(names.stream().count());
        System.out.println(names.stream().collect(Collectors.counting()));
    }
}
