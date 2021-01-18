package com.company;

import java.util.Scanner;

public class binarysystem {
    public static void main(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的整数：");
        int n = scanner.nextInt();
        calculatenum(n);
    }

    public static void calculatenum(int n) {
        int count =0 ;
        for(int i =0;i<32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
