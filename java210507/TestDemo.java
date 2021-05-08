package java210507;

public class TestDemo {

    private int a ;
    public static void main(String[] args) {
        TestDemo test = new TestDemo(66);
        //System.out.println(TestDemo.a);
        //a定义的是私有变量，无法编译成功，只能在本类中使用
    }
    TestDemo(int b){
        a = b;
    }
}
