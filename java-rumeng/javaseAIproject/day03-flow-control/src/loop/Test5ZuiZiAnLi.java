package loop;

public class Test5ZuiZiAnLi {
    public static void main(String[] args) {
        //目标完成数组求最值
        int[] array = {10,20,3,40,50,60,70,80,900,100};
        int max = getmax(array);
        System.out.println(max);
        int min = getmin(array);
        System.out.println(min);
    }
    //设计一个方法，完成数组求最值返回
    public static int getmax(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int getmin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;

    }
}
