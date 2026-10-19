package extendsmodifier;

public class Fu {
    private void privateMethod(){
        System.out.println("privateMethod()");
    }

    void method(){
        System.out.println("method()");
    }

    protected void protectedMethod(){
        System.out.println("protectedMethod()");
    }

    public void publicMethod(){
        System.out.println("publicMethod()");
    }

    public static void main(String[] args) {
    Fu fu=new Fu();
    fu.privateMethod();
    fu.method();
    fu.protectedMethod();
    fu.publicMethod();
    }
}
