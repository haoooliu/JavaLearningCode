package ThreadTest;

/**
 * @author MLH
 * @create 2022-05-04-14:48
 * @Description The second method to create a thread
 */
public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
