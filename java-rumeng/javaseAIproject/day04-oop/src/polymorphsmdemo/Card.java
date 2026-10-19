package polymorphsmdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId;
    private String cardName;
    private String phone;
    private double money;
    //lombok技术可以为类自动添加getter和setter方法，无参构造器，toString方法@data
    //预存金额
    public void deposit(double money){
        this.money += money;
        System.out.println("充值成功，余额为："+this.money);
    }
    //消费金额
    public void consume(double money){
        this.money -= money;
    }
}
