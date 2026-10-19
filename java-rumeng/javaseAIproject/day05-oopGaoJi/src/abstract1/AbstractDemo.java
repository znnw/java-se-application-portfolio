package abstract1;

public class AbstractDemo {
    public static void main(String[] args) {

        //A a = new A("张三", 20); 抽象类不能创建对象
        A a = new B();
        a.show();
        a.show1();
        B b = new B();
        b.show();
        b.show1();

    }
}
