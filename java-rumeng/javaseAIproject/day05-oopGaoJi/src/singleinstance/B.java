package singleinstance;

public class B {
    //懒汉式 单例模式
    public static B b = new B();

    private B() {
    }

    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
