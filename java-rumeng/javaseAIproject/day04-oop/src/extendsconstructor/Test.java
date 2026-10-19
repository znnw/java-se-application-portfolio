package extendsconstructor;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();

    }
}

class Zi extends Fu {
    public Zi() {
        //super();
        //super("ing");
        System.out.println("子类无参构造方法");

    }
}

class Fu {
            public Fu() {
                System.out.println("父类无参构造方法");
            }

            public Fu(String name) {
                System.out.println("父类有参构造方法");
            }


        }