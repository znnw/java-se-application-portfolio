package ThreadAPI;

public class test3 {
    public static void main(String[] args) {
        //join方法，线程插队
        MyThread2 t=new MyThread2();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程输出"+i);
        if (i==1){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程输出"+i);
        }
    }
}