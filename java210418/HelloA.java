package java210418;

public class HelloA {
    public HelloA(){
        System.out.println("I am A class");
    }
    public static void HelloA1(){
        System.out.println("I am A1 class");
    }
    static{
        System.out.println("static A");
    }
    public static void HelloA2(){
        System.out.println("I am A2 class");
    }
}
class HelloB extends HelloA{
    public HelloB(){
        System.out.println("I am B class");
    }
    public static void HelloB1(){
        System.out.println("I am B1 class");
    }
    static {
        System.out.println("static B");
    }
    public static void HelloB2(){
        System.out.println("I am B2 class");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
