package loop;
import java.util.Scanner;
public class test1JiSuangQi
    {   //给下面的代码添加注释

        public static void main(String[] args)
         {
             Scanner sc=new Scanner(System.in);
             //创建一个Scanner对象
             System.out.println("请输入第一个数字：");
             double num1 = sc.nextDouble();
             System.out.println("请输入第二个数字：");
             double num2 = sc.nextDouble();

             System.out.println("请输入运算符号：");
             char ch = sc.next().charAt(0);
             //把这个数据交给一个独立的计算方法，帮我计算出结果并返回给我
             double result = getResult(num1,num2,ch);
             System.out.println(num1 + ch + num2 + "=" + result);

         }
         public static double getResult(double num1,double num2,char ch)
         {
             double result = 0;
             switch(ch)
             {
                 case '+':
                     result = num1 + num2;
                     break;
                 case '-':
                     result = num1 - num2;
                     break;
                 case '*':
                     result = num1 * num2;
                     break;
                 case '/':
                     result = num1 / num2;
                     break;
                     default:
                         System.out.println("输入的运算符有误！");
             }
             return result;
         }

}
