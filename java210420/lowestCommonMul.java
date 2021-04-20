package java210420;

import java.util.Scanner;

public class lowestCommonMul {
    //最小公倍数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.max(a,b);
        while (true) {
            if(min%a==0&&min%b==0){
                System.out.println(min);
                return;
            }else{
                min++;
            }
        }
    }
}
