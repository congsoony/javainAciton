import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException,InterruptedException {

        int x =1337;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> y = executorService.submit(()->Functions.f(x));
        Future<Integer> z= executorService.submit(()->Functions.g(x));

        System.out.println(y.get() + z.get());
        executorService.shutdown();
    }
}
