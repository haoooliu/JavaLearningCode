package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].stuno = i;
            stu[i].grade = (int) (Math.random() * 6 + 1);
            stu[i].score = (int) (Math.random() * (100 + 1));
        }
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].grade == 3) {
                System.out.println(stu[i].showInfo(i));
            }
        }
    }
}
