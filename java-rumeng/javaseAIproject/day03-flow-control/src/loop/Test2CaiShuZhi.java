package loop;

import java.util.Scanner;

public class Test2CaiShuZhi {
    public static void main(String[] args) {
          //猜数字游戏
       guess ();
    }
    public static void guess(){
        int number = (int)(Math.random()*100+1);
        while(true){
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int number2 = sc.nextInt();
            if(number2 > number){
                System.out.println("猜的数字太大了");
            }else if(number2 < number){
                System.out.println("猜的数字太小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
