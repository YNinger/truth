package java210610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class testCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n =sc.nextInt();
        while (n>0) {
            list.add(sc.next());
            n--;
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
