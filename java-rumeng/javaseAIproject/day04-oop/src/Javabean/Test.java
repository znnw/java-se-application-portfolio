package Javabean;

public class Test {
    //javabean实体类基本作用和应用场景
    //基本作用：创建对象，存储数据（封装数据）
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张山");
        s1.setAge(18);
        s1.setchinese(87);
        s1.setMath(99);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getchinese());
        System.out.println(s1.getMath());
        Student s2 = new Student();


        s2.setName("王五");
        s2.setAge(19);
        s2.setchinese(99);
        s2.setMath(99);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getchinese());
        System.out.println(s2.getMath());


        StudentOperator operator = new StudentOperator(s2);
        operator.printAllscore();
        operator.printAverageScore();
    }
}
