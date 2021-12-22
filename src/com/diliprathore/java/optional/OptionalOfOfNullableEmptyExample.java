package com.diliprathore.java.optional;

import java.util.Optional;

public class OptionalOfOfNullableEmptyExample {

    public static Optional<String> ofNullable(){
        return Optional.ofNullable(null);
    }

    public static Optional<String> of(){
        return Optional.of("Hello");
    }

    public static void main(String[] args) {
        Optional<String> ofNullableResult = ofNullable();
        if (ofNullableResult.isPresent()) {
            System.out.println(ofNullableResult.get());
        } else {
            System.out.println(Optional.empty());
        }

        System.out.println("Checking method 'of'..");
        System.out.println(of().get());
    }
}
