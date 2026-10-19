package ExecutorServicedemo;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                10, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

       Future<String> f1= pool.submit(new MyCallable(10));
       Future<String> f2= pool.submit(new MyCallable(20));
       Future<String> f3= pool.submit(new MyCallable(30));
       Future<String> f4= pool.submit(new MyCallable(40));
       Future<String> f5= pool.submit(new MyCallable(50));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
