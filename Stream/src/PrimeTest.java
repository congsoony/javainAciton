import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTest {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> p = IntStream.rangeClosed(2,20).boxed().collect(Collectors.partitioningBy(can->isPrime(can)));
        System.out.println(p);


    }
    public static boolean isPrime(int candidate){
        int candidateRoot = (int) Math.sqrt((double)candidate);
        return IntStream.rangeClosed(2,candidateRoot).noneMatch(i->candidate%i==0);
    }

}
