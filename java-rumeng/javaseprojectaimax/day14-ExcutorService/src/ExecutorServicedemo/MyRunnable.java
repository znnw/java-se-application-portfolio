package ExecutorServicedemo;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("线程启动了");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程启动了"+i);
        }
    }

}
