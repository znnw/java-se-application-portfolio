package extendsOverride;

public class Test2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);
        s.setSex('男');
        System.out.println(s);
        System.out.println(s.toString());
    }
}
class Student extends Object{
    private String name;
    private int age;
    private char sex;

    public Student() {
    }
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
