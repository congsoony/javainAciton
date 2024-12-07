package part5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStream {
    public static void main(String[] args) {
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1,100).boxed()
                        .flatMap(a->
                                IntStream.rangeClosed(a,100)
                                        .filter(b->Math.sqrt(a*a+b*b)%1==0)
                                        .mapToObj(b->
                                                new int[]{a,b,(int)Math.sqrt(a*a+b*b)}));

        pythagoreanTriples.limit(5)
                .forEach(t->
                        System.out.println(t[0]+" "+t[1]+" "+t[2]));

        Stream<double[] > pythagoreanTriple2 =
                IntStream.rangeClosed(1,100).boxed()
                        .flatMap(a->IntStream.rangeClosed(a,100)
                                .mapToObj(b->new double[]{a,b,Math.sqrt(a*a+b*b)})
                                .filter(t->t[2]%1==0));
        pythagoreanTriple2.limit(5)
                .forEach(t-> System.out.println(t[0]+" "+t[1]+" "+t[2]));

        Stream<String> values = Stream.of("config","home","user")
                .flatMap(key->Stream.ofNullable(System.getProperty(key)));

        values.forEach(System.out::println);


        Stream.iterate(0,n->n+2)
                .limit(10)
                .forEach(System.out::println);


        //피보나치 수열 문제
        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(20)
                .forEach(t-> System.out.println("( "+t[0]+","+t[1]+")"));

        //java 9이상 predicate 지원
        Stream.iterate(0,n->n<100,n->n+4).forEach(System.out::println);



    }
}
