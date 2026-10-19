package ExecutorServicedemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private int n;
    public MyCallable(int n){this.n=n;}

    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程计算1-"+n+"的结果是"+sum;
    }
}
