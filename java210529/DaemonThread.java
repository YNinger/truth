package java210529;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){

                }
            }
        });
        t.setDaemon(true);//注释就是t线程一直运行，不注释设置t为守护条件，
        t.start();
    }
}
