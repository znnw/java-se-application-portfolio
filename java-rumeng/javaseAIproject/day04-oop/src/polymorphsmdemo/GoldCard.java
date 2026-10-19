package polymorphsmdemo;

public class GoldCard extends Card{
    public GoldCard( String carId,String cardName,String phone,double money){
        super(carId,cardName,phone,money);
    }
    @Override
    public void consume(double  money){
        System.out.println("普通卡消费价格："+money);
        System.out.println("使用金卡折扣后消费的价格："+money*0.8);
        if (getMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        setMoney(getMoney()-money*0.8);
        if (money*0.8>200) {
            printTicket();
        }else{
            System.out.println("没有达到200，不能获得洗车券");
        }
    }
    public void printTicket(){
        System.out.println("获得洗车券,请打印");
    }

}
