package com.company;

import java.util.Scanner;

public class Three {
    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”.
    // 密码错误，可以重新输入，最多输入三次。
    // 三次均错，则提示退出程序
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = Setpassword(scanner);
        if(VerifyPassword(scanner,password,3)){
            System.out.println("密码正确");
        }
        else{
            System.out.println("多次输入错误，退出程序");
        }
    }
    public static boolean VerifyPassword(Scanner scanner, String password, int i) {

        for(i=1;i<=3;i++){
            System.out.println("请输入验证密码：");
            String typepassword =scanner.next();
            if (typepassword.equals(password)){
                return true;
            }
            else{
                System.out.println("输入错误，你还有"+(3-i)+"次机会");
            }
        }
        return false;
    }

    public static String Setpassword(Scanner scanner) {
        System.out.println("请设置你的密码：");
        return scanner.next();
    }
}
