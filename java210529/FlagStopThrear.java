package java210529;

//线程中断
//  使用标志位：可以实现某种程度上的，在满足条件（中断线程的调教：如转账发现诈骗）情况下，中断一个线程
//  问题：如果线程处于堵塞状态（需要满足一定条件如sleep休眠时间才能恢复），就无法快速的中断线程
public class FlagStopThrear {
    //使用标志位标识是否继续执行线程中的任务，true中断，false继续执行
    private static volatile boolean isStop = false;//标志位

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始转账");
                try {
                    while (!isStop) {
                        System.out.println("转账......");
                        Thread.sleep(1000);
                    }
                    System.out.println("停止转账");
                }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             }).start();
        Thread.sleep(8*1000);
        //终止交易
        isStop = true;

    }
}
