package section1.section1_10.section1_10_3;

import java.util.Random;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("~~~~~thread 2 use time=" + (endTime - beginTime));
    }
}
