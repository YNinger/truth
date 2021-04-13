package java210412;

public class solution {
    public int i;
    static String s;
    void method1(){};
    static void method2(){};
}
class Main{
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(100%3);
        System.out.println(100%3.0);
        System.out.println(i);
        solution s = new solution();
        solution.method2();
    }
}
