package java210529test;

public class testCode {
    public static void main(String[] args) {
        String str = "192.168.1.1" ;
        String[] result = str.split("\\.",1) ;
        for(String s: result) {
            System.out.println(s);
        }
    }
}
