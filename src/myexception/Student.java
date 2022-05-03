package myexception;

public class Student {
    public static void main(String[] args) {
        RegistScore r1 = new RegistScore();
        try {
            r1.RegistScore(101);
            r1.showScore();
        } catch (MyException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
