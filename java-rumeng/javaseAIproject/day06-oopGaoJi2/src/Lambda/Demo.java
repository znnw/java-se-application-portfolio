package Lambda;

public class Demo {
    public static void main(String[] args) {
        Animal a =new Animal(){
            @Override
            public void cry() {
                System.out.println("猫是喵喵喵叫");
            }
        };
        a.cry();
        System.out.println("------------------");
        /*Swim s1 =new Swim(){
            @Override
            public void swimming() {
                System.out.println("可以游");
            }
        };
         */
        Swim s1= ()->{
            System.out.println("可以游");
        };
        s1.swimming();
    }
}
abstract class Animal{
    public abstract void cry();
}
interface Swim{
    public void swimming();
}