package Person;
// 声明一个人员类
public class Person {
    String name; //姓名
    int age; //年龄
    int sex; //性别，1，男，2，女
    public void study(){
        System.out.println("Studying");
    }
    public void showAge(){
        System.out.println("age:"+ age);

    }
    public int addAge(int i){
        age += i;
        return  age;
    }
}
