package constructor;
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三");
        System.out.println("====================");

        Student t1 = new Student();
        t1.name="张三";
        t1.age=18;
        t1.sex='男';
        System.out.println("姓名："+t1.name);
        System.out.println("年龄："+t1.age);
        System.out.println("性别："+t1.sex);
        Student t2=new Student("林雷",18,'男');
        System.out.println("姓名："+t2.name);
        System.out.println("年龄："+t2.age);
        System.out.println("性别："+t2.sex);
    }
}
