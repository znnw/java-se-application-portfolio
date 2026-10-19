package thisdemo;

public class Test {
      public static void main(String[] args) {
          Student s1 = new Student();
          s1.name = "张三";
          s1.print();
          System.out.println(s1);
          System.out.println("-----------------");
          Student s2 = new Student();

          s2.print();
          System.out.println(s2);
          System.out.println("-----------------");
          Student s3 = new Student();
          s3.name = "王五";
          s3.printHobby("唱歌");
      }
}
