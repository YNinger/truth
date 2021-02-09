package java0209;

public class task {


////1.求输出
//class TestDemo{
//    private int count;
//    public static void main(String[] args) {
//        TestDemo test=new TestDemo(88);
//        System.out.println(test.count);
//    }
//    TestDemo(int a) {
//        count=a;
//    }
//}
//
////2.求cnt
////静态代码优先于main函数执行，静态代码不能存在于任何方法体内，静态代码块先运行后实例
//class Test{
//    static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt =" + cnt);
//    }
//    static{
//        cnt /=3;
//    };
//}

    //3.
    static class Test1 {
        public String toString() {
            System.out.print("aaa");
            return "bbb";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Test1());
    }
}

//4
class Test{
    private float f=1.0f;
    int m=12;
    static int n=1;
    public static void main(String args[]){
        Test t=new Test();
    }
}