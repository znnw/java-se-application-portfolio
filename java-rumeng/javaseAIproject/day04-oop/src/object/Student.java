package object;

public class Student {
    String name;
    double math ;
    double chinese;
    public void printAllscore(){
        System.out.println("姓名："+name+" 数学："+math+" 语文："+chinese);
    }
      public void printAvgscore(){
        double avg = (math+chinese)/2;
        System.out.println("姓名："+name+" 平均分："+avg);
    }
    }
