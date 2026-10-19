package Threadsafe;

public class Threaddemo {
    public static void main(String[] args) {
        Account acc = new Account("ICBC",132.14);
        new DrawThread("小明", acc).start();
        new DrawThread( "小红", acc).start();

        Account acc2 = new Account("ICBC2",100000);
        new DrawThread("小明", acc2).start();
        new DrawThread( "小红", acc2).start();
    }
}
