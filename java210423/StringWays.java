package java210423;

public class StringWays {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        String x = "fmn";
        //x.toUpperCase();
        x=x.toUpperCase();
        System.out.println(x);
        String y = x.replace('f','F');
        System.out.println(y);
        ((StringWays)null).testMethod();
    }
}
