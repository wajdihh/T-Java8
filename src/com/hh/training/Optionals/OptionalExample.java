package com.hh.training.Optionals;

import java.util.Optional;

/**
 * Optional is a simple container for a value which may be null or non-null.
 * Think of a method which may return a non-null result but sometimes return nothing.
 * Instead of returning null you return an Optional in Java 8.
 */
public class OptionalExample {

    public void test(){

        Optional<String> optional=Optional.of("bam");

        optional.isPresent(); // true
        optional.get(); // "bam"
        optional.orElse("fallback"); // "bam"

        optional.ifPresent(s-> System.out.println(s.charAt(0))); // "b"
    }
}
