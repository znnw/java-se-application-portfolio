package stream;

public class ParamDemo1 {
    public static void main(String[] args) {
        //可变参数
        sum();
        sum(1,2,3,4,5);
        //优势：接收参数很灵活，可以替代数组传参
        //注意事项：在形参列表中可变参数只能是最后一个参数而且只能放在最后面的位置
    }
    public static void sum(int...nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("和为：" + sum);
    }
}
