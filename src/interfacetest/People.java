package interfacetest;

public interface People {
    void showStatus();
    public static void method1(){
        System.out.println("Interface static method1");
    }
    public default void method2(){
        System.out.println("Interface default method2");
    }
}
