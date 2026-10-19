package staticfield;

public class Test {
    public static void main(String[] args) {
        Student.name = "张三";
        System.out.println(Student.name);


        Student s1=new Student();
        s1.name = "王五";


        Student s2=new Student();
        s2.name = "赵六";
        System.out.println(s2.name);
        System.out.println(s1.name);
        System.out.println(Student.name);
        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);
        System.out.println(s2.age);

    }


}
