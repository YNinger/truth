package java210529;

public class NewRunnable {
    public static void main(String[] args) {
        //使用Runnable接口创建一个任务，再创建线程
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("nice");
            }
        };
        Thread t = new Thread(r);
        //以上合并的写法
        Thread tt = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("nice");
            }
        },"tt");//name代表线程的名称
    }
}
