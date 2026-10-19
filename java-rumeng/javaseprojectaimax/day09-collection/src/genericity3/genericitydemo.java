package genericity3;

import genericity2.Student;

public class genericitydemo {

    public static void main(String[] args) {
        String[] names = {"张三","李四","王五"};
        printArray( names);

        Student[] stus = new Student[3];
        printArray(stus);
    }
    public static <T>void printArray(T[] names){
        System.out.println();
    }
    public static <T> T getMax(T[] names){
        return null;
    }
}