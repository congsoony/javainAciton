package org.example;

import java.util.stream.IntStream;

public class RecursivePrime {
    public static void main(String[] args) {

    }
    static IntStream primes(IntStream numbers){
        int head = head(numbers);
        return IntStream.concat(IntStream.of(head),primes(tail(numbers).filter(n->n%head!=0)));
    }
    static int head(IntStream numbers){
        return numbers.findFirst().getAsInt();
    }
    static IntStream tail(IntStream numbers){
        return numbers.skip(1);
    }

}
