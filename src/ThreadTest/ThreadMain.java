package ThreadTest;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Hello World");
        t1.start();
        System.out.println("Hello");
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "***********");
            }
        }
    }
}
