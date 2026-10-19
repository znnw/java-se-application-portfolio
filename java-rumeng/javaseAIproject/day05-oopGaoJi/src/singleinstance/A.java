package singleinstance;

public class A {
    //饿汉式  单例模式
    private static A a= new A();
    private A(){

    }

    public static A getInstance(){
        return a;
    }
}
