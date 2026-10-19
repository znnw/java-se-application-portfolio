package ExecutorServicedemo;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                10, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable task=new MyRunnable();
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
    }
}
