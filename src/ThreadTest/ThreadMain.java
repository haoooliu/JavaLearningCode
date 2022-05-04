package ThreadTest;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
        try {
            t1.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("非法的线程状态");
        }
    }
}

