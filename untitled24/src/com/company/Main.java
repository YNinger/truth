package com.company;
import java.util.Scanner;
public class Main {

    public static void main1(String[] args) {
        // write your code here
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9 || i / 10 == 9) {
                count++;
            }
            if (i % 10 == 9 && i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main2(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i);
            }
            count++;
        }
        System.out.println("count= " + count);
    }

    public static void main3(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int j = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }

    public static void main4(String[] args) {
        //给定一个数字，判定一个数字是否是素数
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            int i = 0;
            if (num <= 1) {
                System.out.println("输入有误,已退出程序");
                break;
            }
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + "不是素数");
                    break;
                }
            }
            if (num == i) {
                System.out.println(num + "是素数");
            }
        }
    }

    public static void main5(String[] args) {
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的真实年龄:");
        while (true) {
            int age = sc.nextInt();
            if (age == 0) {
                System.out.println("结束进程");
                break;
            }
            if (age <= 18 && age > 0) {
                System.out.println("少年");
            } else if (age < 29 && age > 18) {
                System.out.println("青年");
            } else if (age < 56 && age > 28) {
                System.out.println("中年");
            } else if (age >= 56) {
                System.out.println("老年");
            } else {
                System.out.println("不明生物");
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入行数：");
//        int num = sc.nextInt();
//        int i = 0;
//        for (i = 0; i < num; i++) {
//            //打印一行
//            //先打*，在打印空格
//            int j = 0;
//            for (j = 0; j <= 1; j++) {
//                System.out.print("*");
//                for (j = 0; j < num - 2 * (i + 1); j++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }
}


