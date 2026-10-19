package object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese= 18;
        s1.math = 99;
        s1.printAllscore();
        s1.printAvgscore();
        Student s2 = new Student();
        s2.name = "王五";
        s2.chinese = 99;
        s2.math = 99;
        s2.printAllscore();
        s2.printAvgscore();

    }
}
