package loop;

public class Test7ShiTouMiZheng {
    public static void main(String[] args) {
        //目标：完成数字华容道的初始化和随机乱序
        int n = 5;
        start(n);
    }

    public static void start(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        printArray(arr);
        //随机乱序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int a = (int) (Math.random() * arr.length);
                int b = (int) (Math.random() * arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[a][b];
                arr[a][b] = temp;
            }
        }
        System.out.println("\n乱序---------------------------------------");
       printArray(arr);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}