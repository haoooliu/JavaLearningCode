package ThreadTest;

/**
 * @author MLH
 * @create 2022-05-03-16:09
 * @Description thread test 遍历100以内的所有偶数
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
