package synchronizedDemo;

public class synchronizedtest {
    //锁同步代码块
    /*
    public void DrawMoney(double money){
        String name=Thread.currentThread().getName();
        synchronized (this) {
            if (this.money>=money){
                this.money-=money;
                System.out.println(name+"取钱成功，余额为："+this.money);
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        }

    }
     */
}
