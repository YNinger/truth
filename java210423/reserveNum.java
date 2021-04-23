package java210423;

import java.util.Scanner;
import java.util.Stack;

public class reserveNum {
    //输入一个整数，将这个整数以字符串的形式逆序输出
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n=input;
        int count =1;
        while((n/10)!=0){
            count++;
            n/=10;
        }
        //System.out.println(count);
        int[] ch =new int[count];
        for(int i =0;i<count;i++){
            ch[i] = input%10;
            input/=10;
        }
        //System.out.println(ch.length);
        for(int i =0;i<count;i++){
            System.out.print(ch[i]);
        }
    }
}
