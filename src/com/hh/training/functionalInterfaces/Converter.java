package com.hh.training.functionalInterfaces;

/**
 * + functional interface must contain exactly one abstract method declaration
 *
 * + We can use arbitrary interfaces as lambda expressions as long as the interface only contains one abstract method.
 *  -> To ensure that your interface meet the requirements, you should add the @FunctionalInterface annotation
 */
public interface Converter {

    int convert(String a);

}
