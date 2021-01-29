package java0129;

import java.util.Scanner;

public class test2 {
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while(true){
           System.out.println("请输入一个非负数：");
           int i = scanner.nextInt();
           if(i==0){
               System.out.println("退出程序");
               break;
           }
           int sum = add(i);
           System.out.println(sum);

       }
    }

    public static int add(int i) {
        if(i<10){
            return i;
        }
        return i%10+add(i/10);
    }
}
