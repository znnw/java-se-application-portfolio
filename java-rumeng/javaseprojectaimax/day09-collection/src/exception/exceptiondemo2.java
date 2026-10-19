package exception;

public class exceptiondemo2 {
    public static void main(String[] args) {
        System.out.println("程序执行开始");
        try {
            System.out.println( div(10,0));
            System.out.println("底层方法执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现了异常");
        }
        System.out.println("程序执行结束");

    }

    public static int div(int a,int b) throws Exception {
        if(b==0){
            System.out.println("除数不能为0");
            throw new Exception("除数不能为0");
        }
        return a/b;
    }
}
