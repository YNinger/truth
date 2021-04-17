package java210417;


import java.util.ArrayList;

public class Soutions {
    public static void main(String[] args) {

//        String s;
//        System.out.println(s);
        

        int x = 5>>2;
        int y = x>>>2;
        System.out.println(y);
        StringBuffer s1 = new StringBuffer("a");
        StringBuffer s2 = new StringBuffer("b");
        operate(s1,s2);
        System.out.println(s1+"."+s2);
    }

    public static void operate(StringBuffer s1, StringBuffer s2) {
        s1.append("b");
        s2 =s1;
    }
}
