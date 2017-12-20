package com.hh.training.Predicates;

import java.util.function.Predicate;

/**
 *  Predicates are boolean-valued functions of one argument.
 *  The interface contains various default methods for composing predicates to complex logical terms (and, or, negate)
 */
public class PredicateExample {

    public void test(){

        Predicate<String> predicate = (s)->s.length()>0;

        System.out.println("Predict (test) :"+predicate.test("test"));
        System.out.println("Predict (negate , test) :"+predicate.negate().test("test"));

        Predicate<String> predicate1 = String::isEmpty; // = Predicate<String> predicate1 = s->s.isEmpty();
        System.out.println("Predict (test) :"+predicate1.test("test"));
    }
}
