package java210612;

import java.util.ArrayList;
import java.util.Scanner;

public class testCode {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            list.add(sc.next());
        }
        System.out.println(list.get(list.lastIndexOf(list.get(1))));
    }

    public static void main(String[] args) {
        int i =-1;
        int j =-2;
        System.out.println(i*j);
    }
}
