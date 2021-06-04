package java210604;

import java.util.Scanner;

public class sendEmail {
    //发邮件
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n =sc.nextInt();
            long sum = count(n);
            System.out.println(sum);
        }
    }
    private static long count(int n){
        if(n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        return (n-1)*(count(n-1)+count(n-2));
    }
}
