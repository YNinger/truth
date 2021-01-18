package com.company;

import java.util.Scanner;

public class doublenmul {
    public static void main(String[] args) {
        System.out.println("请输入要打印乘法表的行列数:");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        printMultiplicationTable(n);
        }

    public static void printMultiplicationTable(int n) {
        for(int i=1 ; i<=n;i++){
            printline(i,n);
        }
    }

   public static void printline(int i, int n) {
        for(int j =1;j<=i;j++){
            System.out.printf("%d*%d=%-2d " , i, j , j*i );
        }
       System.out.println();
    }
}

