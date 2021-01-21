package text;

public class X {

    public X(){
        System.out.print("X");//构造方法
    }
    {
        System.out.print("代码块1");
    }
    Y y=new Y();//就地初始化，就地初始化和代码块的执行顺序没有优先级，但是都优先于构造方法
    {
        System.out.print("代码块2");
    }

}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();//对Z进行创建对象也就是对Z实例化，但是并没有创建引用保存该地址
    }
}
