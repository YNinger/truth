package java210529;

public class InterruptThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                //以下try catch的使用是会出问题的
                //抛出异常以后会进行重复使用while进行转账
                //不安全
//                System.out.println("开始转账");
//                while (!Thread.currentThread().isInterrupted()){
//                    System.out.println("转账ing...");
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }

                try {
                    System.out.println("开始转账");
                    while (!Thread.currentThread().isInterrupted()){
                        System.out.println("转账ing...");
                        Thread.sleep(10000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        Thread.sleep(3*1000);
        t.interrupt();//将该线程置为true

    }
}

