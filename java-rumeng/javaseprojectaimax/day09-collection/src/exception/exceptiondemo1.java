package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exceptiondemo1 {
    public static void main(String[] args) {

        //show();
        try {
            show2();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    //编译时异常
    public static void show2() throws ParseException {
        String str = "2024-07-07 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println("show方法结束");
    }
    //运行时异常
    public static void show(){
        System.out.println("show方法开始执行");
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
        System.out.println("show方法执行结束");
    }

}
