package capsulation;

public class Student {
    private String name;
    private int age;
    private double chinese;
    private double math;
    public void setName(String name){
        if(name.length()<2||name.length()>4){
            System.out.println("名字长度不符合要求");
            return;
        }else {
        this.name = name;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age<0||age>120){
            System.out.println("年龄不符合要求");
            return;
        }else {
        this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public void setchinese(double chinese){
        if(chinese<0||chinese>100){
            System.out.println("语文成绩不符合要求");
            return;
        }else {
        this.chinese = chinese;
        }
    }
    public double getchinese(){
        return chinese;
    }

    public void setMath(double math){
        if(math<0||math>100){
            System.out.println("数学成绩不符合要求");
            return;
        }else {
        this.math = math;
        }
    }
    public double getMath(){
        return math;
    }

    public void printAllScore(String name){
        System.out.println(name+"的语文成绩是："+(chinese+math));
    }
    public void printAverageScore(String name){
        System.out.println(name+"的平均成绩是："+(chinese+math)/2);
    }
}
