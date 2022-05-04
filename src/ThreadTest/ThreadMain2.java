package ThreadTest;

/**
 * @author MLH
 * @create 2022-05-04-14:51
 * @Description
 */
public class ThreadMain2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        t1.start();
    }
}
