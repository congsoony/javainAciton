package part7;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println(sequentialSum(100));
    }
    //1~n까지의합
    public static long sequentialSum(long n){

        return Stream.iterate(1L,i->i+1)
                .limit(n)
                .reduce(0L,Long::sum);
    }
}
