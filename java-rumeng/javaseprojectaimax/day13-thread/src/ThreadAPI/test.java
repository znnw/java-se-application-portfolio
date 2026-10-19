package ThreadAPI;

public class test {
    public static void main(String[] args) {

       MyThread t=new MyThread("1号线程");
        t.start();
        System.out.println(t.getName());

        MyThread t2=new MyThread("2号线程");
        t2.start();
        System.out.println(t2.getName());
        //run方法不会明显开新线程，start方法可以

        Thread m=Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());
    }
}
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程启动了"+i);
        }
    }
}
