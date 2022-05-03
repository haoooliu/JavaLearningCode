package Animal;

public class Animal {
    public int age;
    public void eat() {
        System.out.println("Animals can eat!");
    }

    public void shout() {
        System.out.println("Animals can shout!");
    }

    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}
