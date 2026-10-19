package polymorphsmdemo;

public class SilverCard extends Card{
    public SilverCard( String carId,String cardName,String phone,double money){
        super(carId,cardName,phone,money);
    }

    @Override
    public void consume(double money){
        System.out.println("普通卡消费价格："+money);
        System.out.println("使用银卡折扣后消费的价格："+money*0.9);
        if (getMoney()<money*0.9){
            System.out.println("余额不足");
            return;
        }
        setMoney(getMoney()-money*0.9);
        if (money*0.9>300) {
            printTicket();
        }else{
            System.out.println("没有达到200，不能获得洗车券");
        }
    }
    public void printTicket(){
        System.out.println("获得洗车券,请打印");
    }
}
