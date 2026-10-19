package capsulation;

public class Test {
    public static void main(String[] args) {
        //目标：学会封装，合理隐藏合理暴露
     Student s1 = new Student();
      s1.setName("张三");
      System.out.println(s1.getName());
      s1.setAge(18);
      System.out.println(s1.getAge());
      s1.setchinese(99);
      System.out.println(s1.getchinese());
      s1.setMath(100);
      System.out.println(s1.getMath());
      s1.printAllScore(s1.getName());
      s1.printAverageScore(s1.getName());
    }
}
