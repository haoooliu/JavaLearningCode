package Monkey;

public class Monkey extends Exception {
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println(this.age);
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void yearPlus(int age){
        this.age += age;
    }
    public Monkey(String msg){
        super(msg);
    }

}
