
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        int x = 1337;
        Result result = new Result();

        Thread t1 = new Thread(()->{result.left = Functions.f(x);}); //x *2
        Thread t2 = new Thread(()->{result.right=Functions.g(x);}); //x+1

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(result.left + result.right);
    }

    private static class Result{
        private int left;
        private int right;
    }
}
