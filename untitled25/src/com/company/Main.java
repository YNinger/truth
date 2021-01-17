package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
	// write your code here
        //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序
        Random random =new Random();
        int toguess = random.nextInt(100)+1;//左闭右开[0,101)
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        while(true){
            int input = scanner.nextInt();
            if(input>toguess){
                System.out.println("大了，请重新输入");
            }
            else if(input<toguess){
                System.out.println("小了，请重新输入");
            }
            else{
                System.out.println("回答正确，退出程序");
                break;
            }
        }
    }
}
