package api;

import java.math.BigDecimal;

public class Test3 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.3;
        System.out.println(a+b);
        // 1、把小数包装成BigDecimal对象来运算才可以。
        // 必须使用 public BigDecimal(String val)
//        BigDecimal a1 = new BigDecimal(Double.toS
//        BigDecimal b1 = new BigDecimal(Double.toS

        // 优化方案，可以直接调用valueOf方法，内部使用的就是public BigDecimal(String val) 字符串构造器
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1); // 解决精度问题的手段
        double result = c1.doubleValue(); // 目的 把BigDecimal对象转成double类型
        System.out.println(result);

        System.out.println("------------");

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        // 除法
        BigDecimal k = i.divide(j, 2, BigDecimal.ROUND_HALF_UP); // 抛异常
        System.out.println(k);
    }
    }
