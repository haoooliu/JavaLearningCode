package ThreadTest;

/**
 * @author MLH
 * @create 2022-05-03-16:09
 * @Description thread test 遍历100以内的所有偶数
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("ThreadName: " + Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() +"Num:" + i);
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                if(i % 20 == 0){
                    this.yield();
                }
            }
        }
    }
}
