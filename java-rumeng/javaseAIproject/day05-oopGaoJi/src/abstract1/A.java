package abstract1;

public abstract class A {
    private String name;
    private int age;
    public A(){
        System.out.println("无参构造器");

    }
    public A(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造器");
    }
    public abstract void show();
    public void show1(){
        System.out.println("show方法");
    }
}
//抽象类的使命就是被子类继承
// 抽象类不能创建对象
//子类继承抽象类，必须重写抽象类中的抽象方法，否则子类也是抽象类
