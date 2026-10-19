package reflect;

public class Reflectdemo {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("reflect.Student");
        System.out.println(c1);


        Class c2 = Student.class;
        System.out.println(c2);


        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);
    }

}
