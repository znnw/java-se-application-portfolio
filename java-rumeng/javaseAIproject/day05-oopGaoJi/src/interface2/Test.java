package interface2;

public class Test {
    public static void main(String[] args) {
        Student[] allstudents = new Student[10];
        allstudents[0] = new Student( "张三", 18, '男', 90);
        //造10组不同的数据
         allstudents[1] = new Student( "李四", 16, '男', 93);
         allstudents[2] = new Student( "王五", 17, '男', 95);
         allstudents[3] = new Student( "赵六", 18, '男', 97);
         allstudents[4] = new Student( "孙七", 16, '男', 99);
         allstudents[5] = new Student( "周八", 17, '男', 91);
         allstudents[6] = new Student( "吴九", 18, '男', 93);
         allstudents[7] = new Student( "郑十", 16, '男', 95);
         allstudents[8] = new Student( "王十一", 17, '男', 97);
         allstudents[9] = new Student( "张十二", 18, '男', 99);

        ClassDataInter cdi = new ClassDataInter1(allstudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
