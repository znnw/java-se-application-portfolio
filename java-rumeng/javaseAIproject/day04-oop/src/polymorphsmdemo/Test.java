package polymorphsmdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard gc = new GoldCard("粤AS1344","delei","18933055065",6000.0);
        pay(gc);
        SilverCard sc = new SilverCard("粤AS1345","delei","18933055065",5000.0);
        pay(sc);

    }
    public static void pay(Card card){
        System.out.println("请刷卡"+"使用"+card.getCarId()+card.getCardName()+"支付");
        System.out.println("请输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);
    }
}
