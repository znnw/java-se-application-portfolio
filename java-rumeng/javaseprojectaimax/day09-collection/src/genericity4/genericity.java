package genericity4;

import java.util.ArrayList;

public class genericity {
    public static void main(){
        //ArrayList<int> list = new ArrayList<>();
        //list.add();
        //包装类
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(20);
        System.out.println(i1==i2);
        
        Integer i11 = 100;
        Integer i22 = 200;
        System.out.println(i11==i22);
        
        int i=i1;
        System.out.println(i);
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(130);
        
        int rs = list.get(0);
        
        //包装类的功能
        //1.自动装箱
        //2.自动拆箱
        //3.包装类对象可以转换为基本数据类型
        //4.基本数据类型可以转换为包装类对象
    }
}
