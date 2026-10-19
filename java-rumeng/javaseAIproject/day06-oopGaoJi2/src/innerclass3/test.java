package innerclass3;

public class test {
    public static void main(String[] args) {
        Swim s1=new Student1();
        start(s1);

    }
    public static void start (Swim s){
        System.out.println("start swimming");
        s.swimming();
        System.out.println("end swimming");
    }
}
class Student1 implements Swim{
    @Override
    public void swimming(){
        System.out.println("student can swim");
    }
}

class Teacher implements Swim{
    @Override
    public void swimming(){
        System.out.println("teacher can swim");
    }
}
interface Swim{
    public void swimming();
}