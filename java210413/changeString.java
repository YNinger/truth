package java210413;

import java.util.Arrays;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;


public class changeString {
//    //将一句话的单词进行倒置，标点不导致
//    Stack<StringBuffer> a = new Stack<>();
//    //首先先用栈针对每一个字符进行压栈
//    //当遇到空格的时候将该字符串出栈

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedList<Character> list = new LinkedList<Character>();
        //用for循环取每一个空格之间的字符串
        //此时是先取出最后一个字符串
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !=' '){
                char c = s.charAt(i);
                list.add(c);
                continue;
            }
            //removeLast是取出字符串的最后一个字符
            String str = "";
            while(list.size()>0){
                str += list.removeLast();
            }
            System.out.print(str+" ");
        }
        //下边打印的是最后一个空格后边的字符串
        //因为在最后取到最后一个字符串的时候i==0，此时循环i--，i==-1，不能进入循环
        //需要另外给定一个循环来取出所含字符串
        String str = "";
        while(list.size()>0){
            str += list.removeLast();
        }
        System.out.print(str+" ");
    }
}

