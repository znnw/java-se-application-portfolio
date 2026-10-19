package lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk =new ReentrantLock();
    public void DrawMoney(double money){

        String name=Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money>=money){
                this.money-=money;
                System.out.println(name+"取钱成功，余额为："+this.money);
            }else {
                System.out.println(name+"取钱失败，余额不足");
            }
        } finally {
            lk.unlock();
        }
    }

    }
