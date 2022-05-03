package Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.eat();
        ani.shout();
        System.out.println("*******");
        ani.func(new Dog());
        ani.func(new Cat());
        ani.func(new Animal());
        Cat cat = new Cat();
        cat.setAge(4);
        System.out.println(cat.age);
    }

}

