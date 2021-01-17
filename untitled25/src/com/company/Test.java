package com.company;

public class Test {
    public static void main1(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        System.out.println(" sum= " + calculate());
    }

    public static double calculate() {
        double sum =0.0;
        int flag = 1;
        for(double n =1.0;n<=100;n++){
            sum += flag*(1/n);
            flag = -flag;
        }
        return sum;
    }

    public static void main(String[] args) {
        //求两个正整数的最大公约数
        int a = 20;
        int b = 30;
        System.out.println("最大公约数为："+ gcd(a,b));
    }
    private static int  gcd(int a,int b) {
        int num =0;
        if(a>b){
            num =b;
        }
        else{
            num =a;
        }
        while(true){
            if(b%num==0&&a%num==0){
                break;
            }
            num--;
        }
        return num;
    }
}
