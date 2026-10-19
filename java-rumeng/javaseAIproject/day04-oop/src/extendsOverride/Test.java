package extendsOverride;

public class Test {
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.cry();
    }
     static class Dog extends Animal{
        @Override
        public void cry(){
            System.out.println("汪汪汪");
        }
    }
    static class Animal{
        public void cry(){
            System.out.println("动物叫");
        }
    }
}