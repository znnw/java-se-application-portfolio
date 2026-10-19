package Filedemo;

import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws Exception{
        String name ="我爱你" ;
        byte[] bytes=name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        String name2=new String(bytes,"GBK");
        System.out.println(name2);
    }
}
