package Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 18;
        p1.name = "Lucy";
        p1.sex = 1;
        p1.showAge();
        p1.addAge(2);
        p1.study();
        p1.showAge();
        Person p2 = new Person();
        p2.age = 40;
        p2.name = "Tom";
        p2.sex = 2;
        p2.addAge(5);
        p2.name = "Tom";
        p2.showAge();
        double pai = Math.PI;
        System.out.println(pai);
    }
}
