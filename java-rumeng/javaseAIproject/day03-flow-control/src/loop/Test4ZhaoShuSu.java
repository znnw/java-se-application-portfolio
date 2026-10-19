package loop;
import java.util.Scanner;
public class Test4ZhaoShuSu {
    public static void main(String[] args) {
      //目标找到101-200的所有素数
        for(int i = 101; i <= 200; i++){
            if (true==isPrime(i)){
                System.out.println(i);
        }

    }
    }
      public static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
}

}
