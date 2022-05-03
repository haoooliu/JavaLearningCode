package Monkey;

public class MonkeyMain {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("abc");
        m1.setAge(2);
        m1.getAge();
        m1.setName("Lily");
        m1.getName();
        m1.yearPlus(2);
        m1.getAge();
    }
}
