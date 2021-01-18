package com.company;

import java.util.Scanner;

public class printsinglenum {
    public static void main(String[] args) {
        //输出一个整数的每一位，如：123的每一位是1，2，3
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printsingleNum(n);
    }

    public static void printsingleNum(int n) {
        if(n>9){
            printsingleNum(n/10);
        }
        System.out.println(n%10);
    }

}
