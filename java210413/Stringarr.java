package java210413;

import java.util.LinkedList;
import java.util.Scanner;

public class Stringarr {
    public static void main(String[] args) {
        String s = "asdf asd";
        LinkedList<Character> list = new LinkedList<Character>();
        //用for循环取每一个空格之间的字符串
        //此时是先取出最后一个字符串
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                char c = s.charAt(i);
                list.add(c);
                System.out.println(c);
                continue;
            }
            System.out.println(s.length());
            System.out.println(list);
            System.out.println(list.removeLast());
            System.out.println(list);
        }
    }
}