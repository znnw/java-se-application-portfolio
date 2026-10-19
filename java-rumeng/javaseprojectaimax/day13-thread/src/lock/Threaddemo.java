package lock;

import Threadsafe.Account;
import Threadsafe.DrawThread;

public class Threaddemo {
    public static void main(String[] args) {
        Threadsafe.Account acc = new Threadsafe.Account("ICBC",132.14);
        new Threadsafe.DrawThread("小明", acc).start();
        new Threadsafe.DrawThread( "小红", acc).start();

        Threadsafe.Account acc2 = new Account("ICBC2",100000);
        new Threadsafe.DrawThread("小明", acc2).start();
        new DrawThread( "小红", acc2).start();
    }
}
