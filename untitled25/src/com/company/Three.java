package com.company;

import java.util.Scanner;

public class Three {
    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”.
    // 密码错误，可以重新输入，最多输入三次。
    // 三次均错，则提示退出程序
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请设置密码：");
        String password = scanner.toString();
    }
}
