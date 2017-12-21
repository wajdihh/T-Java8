package com.hh.training.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * In this class we wll use stream for Sequential Sort , just add stream() to any of collection or map class (Arraylist , hashmap etc..)
 */
public class StreamExample {

    private List<String> stringCollection;

    public StreamExample(){
        stringCollection=new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
    }

    public void forEach(){
//        stringCollection.stream().forEach(a->{
//            System.out.println(""+a);
//        });

        stringCollection.stream().forEach(System.out::println);
    }

    public void filter(){
        stringCollection
                .stream()
                .filter(s->s.startsWith("a"))
                .forEach(System.out::println);
    }

    /**
     * Keep in mind that sorted does only create a sorted view of the stream without manipulating the ordering of the backed collection
     */
    public void sort(){
        stringCollection
                .stream()
                .sorted()
                .filter(s->s.startsWith("a"))
                .forEach(System.out::println);
    }

    /**
     * The intermediate operation map converts each element into another object via the given function.
     * The following example converts each string into an upper-cased string. But you can also use map to transform each object into another type.
     */
    public void map(){
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a,b)->a.compareTo(b))
                .forEach(System.out::println);
    }

    /**
     * Various matching operations can be used to check whether a certain predicate matches the stream.
     * All of those operations are terminal and return a boolean result.
     */
    public void match(){
        boolean anyStartsWithA=stringCollection.stream().anyMatch(s->s.startsWith("a"));
        System.out.println("anyStartsWithA : "+anyStartsWithA);

        boolean allStartsWithA=stringCollection.stream().allMatch(s->s.startsWith("a"));
        System.out.println("allStartsWithA : "+allStartsWithA);


        boolean noneStartsWithZ=stringCollection.stream().noneMatch(s->s.startsWith("z"));
        System.out.println("noneStartsWithZ : "+noneStartsWithZ);


    }

    /**
     * Count is a terminal operation returning the number of elements in the stream as a long
     */
    public void count(){

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3
    }

    /**
     * This terminal operation performs a reduction on the elements of the stream with the given function.
     * The result is an Optional holding the reduced value
     */
    public void reduce(){

      Optional<String> red=  stringCollection
                .stream()
                .reduce((a,b)->a+" / "+b);

      red.ifPresent(System.out::println);

    }

    public void Parallel_Streams(){
        //Sequential Sort
        long count = stringCollection.stream().sorted().count();

        //Parallel Sort
        long count2 = stringCollection.parallelStream().sorted().count();
        /*
          As you can see both code snippets are almost identical but the parallel sort is roughly 50% faster.
          All you have to do is change stream() to parallelStream().
         */
    }
}
