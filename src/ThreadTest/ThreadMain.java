package ThreadTest;
/**
 * @author MLH
 * @create 2022-05-03-16:09
 * @Description thread test 遍历100以内的所有偶数
 */
public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("MyThread1");
        try {
            t1.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("非法的线程状态");
        }
        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0 ){
                if ( i == 10 ){
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + "main:" + i);
            }
        }
    }
}

