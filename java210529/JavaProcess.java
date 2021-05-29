package java210529;

public class JavaProcess {
    public static void main(String[] args) {
        A a = new A(){
            //匿名内部类，本质是A的子类，但不能等同A 类型
            //可以重写方法，或不重写（通过继承的方法）
            @Override
            public void pro() {
                //类定义中的方法定义，没有方法调用，要被调用才可以被执行
                System.out.println("pro");
            }
        };
        a.pro();//想打印pro而不是a pro

        B b= new B() {
            //匿名内部类：B接口的实现类，不能等同于B
            @Override
            public void pro() {
                System.out.println("pro");
            }
        };
        b.pro();
    }

    //静态内部类
    static class A{
        public void pro(){
            System.out.println("a pro");
        };
    }
    //内部接口
    interface  B{
        void pro();
    }
}
