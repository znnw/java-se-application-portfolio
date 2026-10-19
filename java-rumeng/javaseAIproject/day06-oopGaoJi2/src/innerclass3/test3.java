package innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class test3 {
    public static void main(String[] args) {
        Student[] students=new Student[6];
        //名字，年龄，分数，性别

        students[0]=new Student("小王",18,90.5,"男");
        students[1]=new Student("小王",18,90.5,"男");
        students[2]=new Student("小张",16,94.5,"男");
        students[3]=new Student("小李",17,95.5,"男");
        students[4]=new Student("小赵",19,96.5,"男");
        students[5]=new Student("小孙",18,97.5,"男");

        Arrays.sort(students, new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
            });
        for( int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getSex()+" "+s.getScore());
        }

    }
}
