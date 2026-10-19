package polymorphsm1;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.run();
        System.out.println(a1.name);

        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
      }
 }
