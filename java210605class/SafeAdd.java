package java210605class;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeAdd {

    private static AtomicInteger COUNT = new AtomicInteger();
    //这个AtomicInteger包不会产生原子性问题，线程安全
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        COUNT.incrementAndGet();
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1) Thread.yield();
        System.out.println(COUNT.get());
    }
}

