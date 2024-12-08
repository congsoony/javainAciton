package org.example.part7;

import java.util.stream.Stream;

public class ParallSteram {
    public static void main(String[] args) {

        System.out.println(parallelSum(100));


    }
    public static long parallelSum(long n){
        return Stream.iterate(1L,i->i+1)
                .limit(n)
                .parallel()
                .reduce(0L,Long::sum);
    }
    public static long sequentialSum(long n){

        return Stream.iterate(1L,i->i+1)
                .limit(n)
                .reduce(0L,Long::sum);
    }
}
