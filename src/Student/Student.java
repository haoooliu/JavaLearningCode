package Student;

public class Student {
    int stuno;
    int score;
    int grade;
    String courseName;
    public String showInfo(int l){
        return "Student No:" + stuno + " ,Score: " + score + " ,Grade: " + grade;
    }
    public void shinowScore(){
        System.out.println("Student Score: " + score);
    }
    public void showCourse(){
        System.out.println("Student CourseName: " + courseName);
    }
}
