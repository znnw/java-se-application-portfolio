package create;

public class Test2 {
    public static void main(String[] args) {
        //Runnable 接口创建线程
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main线程启动了"+i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" 子线程启动了"+i);
        }
    }
}