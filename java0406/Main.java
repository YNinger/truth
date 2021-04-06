package java0406;

import java.util.Scanner;

public class Main {
    //求一个给定的数要变几步才可以变成斐波那契数列中的数值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int input = sc.nextInt();
            find(input);
        }
    }

    public static void find(int input){
        int[] fib = new int[input];
        fib[0] = 0;
        fib[1] = 1;
        int i =0;
        for (i=2;i<input;i++){
            if (i>1){
                fib[i] = fib[i-1]+fib[i-2];
                if(fib[i]>input){
                    break;
                }
            }
        }
        int a = fib[i]-input;
        int b = input - fib[i-1];
        System.out.println(Math.min(a, b));
    }

}
