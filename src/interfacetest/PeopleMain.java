package interfacetest;

public class PeopleMain {
    public static void main(String[] args) {
        Peopleim p1 = new Peopleim();
        p1.showStatus();
        boolean b1 = p1.equals(new Peopleim());
        System.out.println(b1);
        People.method1();
        p1.method2();
        Peopleim.Brain brain = p1.new Brain();
        brain.addBrainAge(6);
        brain.showBrainAge();
    }
}
