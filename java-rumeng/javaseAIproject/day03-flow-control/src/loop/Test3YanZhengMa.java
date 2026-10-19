package loop;

public class Test3YanZhengMa {
    public static void main(String[] args) {
        //开发验证码
        //1.调用一个方法返回执行位数的验证码，每位只能是大写字母或者小写字母或者数字
        String code = getCode();
        System.out.println("验证码是"+code);
        //2.把验证码输出到控制台
    }
    public static String getCode(){
        String code = "";
        for(int i = 0; i < 4; i++){
            int number = (int)(Math.random() * 10);
            char ch = (char)(Math.random() * 26 + 'a');
            char ch2 = (char)(Math.random() * 26 + 'A');
            int number2 = (int)(Math.random() * 10);
            code += number;
            code += ch;
            code += ch2;
            code += number2;
        }
        return code;
    }
}
