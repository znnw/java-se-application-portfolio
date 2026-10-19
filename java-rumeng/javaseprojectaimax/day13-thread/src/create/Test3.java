package create;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) {
        //Callable接口创建线程
        Callable c = new MyCallable(100);
        FutureTask< String> ft = new FutureTask<>(c);
        Thread t = new Thread(ft);
        t.start();

        Callable c2 = new MyCallable(200);
        FutureTask< String> ft2 = new FutureTask<>(c2);
        Thread t2 = new Thread(ft2);
        t2.start();

        try {
            String s = ft.get();
            System.out.println(s);
            String s2 = ft2.get();
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable {

    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程计算1-"+n+"的结果是"+sum;
    }
}