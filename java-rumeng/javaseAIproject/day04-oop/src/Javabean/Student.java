package Javabean;

public class Student {
    private String name;
    private int age;
    private double chinese;
    private double math;
    //无参构造器
    public Student() {
        System.out.println("无参构造器启动==========");
    }
    //有参构造器
    public Student(String name ,int age, double chinese, double math
    ) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        System.out.println("有参构造器启动==========");
    }

    //提供公开的getter和setter方法
    public void setName(String name){
        this.name=name;
    }
    public String getName( ){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge( ){
        return age;
    }


    public void setchinese(double chinese){
        this.chinese = chinese;
    }
    public double getchinese( ){
        return chinese;
    }


    public void setMath(double math){
        this.math = math;
    }
    public double getMath( ){
        return math;
    }
}
