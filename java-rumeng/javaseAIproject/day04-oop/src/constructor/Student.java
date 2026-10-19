package constructor;

public class Student {
    String name;
    int age;
    char sex;
    //无参构造器
    //构造器：是一种特殊的方法，不能写返回值类型，必须和类名相同，构造器会自动调用
    public Student(){
        System.out.println("无参构造器执行了==================");
    }
    //有参构造器

    public Student(String n){
        System.out.println("有参构造器执行了==================");
    }
    public Student(String n,int a,char s){
      name = n;
      age = a;
      sex = s;
    }
    //构造器特点：1.构造器不能有返回值类型 2.构造器必须和类名相同 3.构造器会自动调用
}
