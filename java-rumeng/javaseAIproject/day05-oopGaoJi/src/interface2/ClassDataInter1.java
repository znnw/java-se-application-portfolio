package interface2;

public class ClassDataInter1 implements ClassDataInter {
    private Student[] allstudents;

    public ClassDataInter1(Student[] allstudents) {
         this.allstudents = allstudents;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("所有学生的信息如下：");
        for (int i = 0; i < allstudents.length; i++) {
            Student s =allstudents[i];
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getSex()+" "+s.getScore());
        }

    }

    @Override
    public void printAverageScore() {
       double sum = 0;
       for (int i = 0; i < allstudents.length; i++) {
           sum += allstudents[i].getScore();
       }
       System.out.println("所有学生的平均分是："+(sum/allstudents.length));
    }
}
