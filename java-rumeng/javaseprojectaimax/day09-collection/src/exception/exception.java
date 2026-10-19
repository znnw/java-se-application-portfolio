package exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exception {
    public static void main(String[] args) {
        try {
         show();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("程序执行结束");
        }

    private static void show() throws ParseException,FileNotFoundException{
        String str ="2040-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date= sdf.parse(str);
        System.out.println(date);

        InputStream is = new FileInputStream("d:/a.txt");
    }
}

