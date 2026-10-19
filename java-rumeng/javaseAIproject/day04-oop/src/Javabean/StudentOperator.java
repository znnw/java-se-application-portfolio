package Javabean;

public class StudentOperator {
    //拿到要处理的学生对象
    private Student s;
    public StudentOperator(Student s) {
        this.s = s;
    }


        public void printAllscore (){
            System.out.println(s.getName() + "的总成绩是：" + (s.getchinese() + s.getMath()));
        }
        public void printAverageScore (){
            System.out.println(s.getName() + "的平均成绩是：" + (s.getchinese() + s.getMath()) / 2);
        }
}
