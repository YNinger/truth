package java210529;

public class NewThread {
    //匿名内部类+Thread方式创建一个线程
    public static void main(String[] args) {
        //用匿名内部类的方式创建一个线程
        Thread t = new Thread(){
            @Override
            //重写run方法，定义要执行的对象
            public void run() {
                //线程要执行的任务
                System.out.println("nice");
            }
        };
        t.start();
        //继承Thread的方式创建线程
        A a = new A();
        Thread aa = new A();
        a.start();
        aa.start();
    }
}

class A extends Thread{
    @Override
    public void run() {
        System.out.println("nice");
    }
}
