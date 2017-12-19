package com.hh.training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda expression is used to simplify code
 */
public class LambdaExample {

    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    /**
     * The static utility method Collections.sort accepts a list and a comparator in order to sort the elements of the given list
     */
    public void step1(){

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }


    /**
     * We can write it like this
     */
    public void step2(){

        Collections.sort(names,(String a,String b) -> {
            return  a.compareTo(b);
        });
    }

    /**
     * We can write it like this more simple
     */
    public void step3(){

        Collections.sort(names,(String a, String b) -> a.compareTo(b));
    }

    /**
     * The best way like this , because we know the variable type
     */
    public void step4(){

        Collections.sort(names,(a,b)->b.compareTo(a));


        System.out.println("names sorted are :"+names);
    }

}
