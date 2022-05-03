package ArgsTest;

public class ArgsTest {
    public void method1(String str) {
        System.out.println(str);
    }
    public void method2(String ... str) {
        for (int i = 0 ; i < str.length ; i++ ){
            System.out.println(str[i]);
        }
    }
}