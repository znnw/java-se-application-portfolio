package create;

public class Test {
    //main方法本身就有一条线程，创建多线程
    //创建线程的类对象，代表线程
    public static void main(String[] args) {

        MyThread t=new MyThread();
        t.start();
        //run方法不会明显开新线程，start方法可以

        for (int i = 0; i < 5; i++){
            System.out.println("main线程");
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程启动了");
        }
    }
}