package java210609;

import java.util.Scanner;
import java.util.Stack;

public class myReserve {
    //【中级】单词倒排
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String s1 ="";
        //reserve1(sc,s,stack,s1);
        reserve2(sc,s,stack,s1);
    }

    public static void reserve2(Scanner sc, String s, Stack<String> stack, String s1) {
        //用spilit，正则表达式，replace实现
        //s.replace()
    }


    public static void reserve1(Scanner sc,String s,Stack<String> stack,String s1) {
        for (int i = 0; i <s.length(); i++) {
            if ((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){
                s1+=s.charAt(i);
            }else{
                stack.push(s1);
                s1="";
            }
        }
        stack.push(s1);
        while(!stack.empty()){
            if (stack.peek()==""){
                stack.pop();
            }else {
                System.out.print(stack.pop()+" ");
            }
        }
    }
}
