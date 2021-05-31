package java210531;

public class unsafeThread {
    private static int count;
    public static void main(String[] args) {
        int n=0;
        for (int i = 0; i <2 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<2000;j++) {
                        // n++;无法执行,因为局部变量存放在main线程中的栈中，是线程私有的

                        count++;
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){
            //等待子线程执行完毕，打印多个线程++计数的值
            //yield是线程让步
            Thread.yield();
        }
        //debug时每次输出的count值都不一样
        System.out.println(count);
    }
}
