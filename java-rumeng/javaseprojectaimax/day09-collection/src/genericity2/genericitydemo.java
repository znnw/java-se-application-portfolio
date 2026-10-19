package genericity2;

public class genericitydemo {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(new Student());

    }
}
