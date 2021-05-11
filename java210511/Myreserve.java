package java210511;

import java.util.Scanner;

public class Myreserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = new StringBuffer(s).reverse().toString();
        System.out.println(s);

    }
}
