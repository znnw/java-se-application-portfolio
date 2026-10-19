package lock;

import Threadsafe.Account;

public class DrawThread extends  Thread{
    private Threadsafe.Account acc;
    public DrawThread(String  name, Account acc){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.DrawMoney(132.14);
    }
}
