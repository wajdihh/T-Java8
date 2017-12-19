package com.hh.training.extensionMethods;

public interface Formula {

    double calculate(int a);

    /**
     * IF we use default keyword we can override method inside interface in java 8
     * @param a
     * @return
     */
    default double sqrt(int a){
        return Math.sqrt(a);
    }

    default double sum(int a, int b){
        return  a+b;
    }
}
