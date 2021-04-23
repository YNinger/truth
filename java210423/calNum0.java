package java210423;

import java.util.Scanner;

public class calNum0 {
    public static void main(String[] args) {
        //输入一个正整数n,求n!(即阶乘)末尾有多少个0?比如: n = 10; n! = 3628800,所以答案为2
        //1.测试未通过
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long ret =calFactorial(n);
//        System.out.println(ret);
//        long count = 0;
//        while(ret%10==0){
//            count++;
//            ret/=10;
//        }
//        System.out.println(count);
//    }
//
//    public static long calFactorial(long n) {
//        if(n==1){
//            return n;
//        }
//        return n*calFactorial(n-1);

        //2.测试未通过
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int ret =n;
//        //计算从1~n有多个2和5就可以计算末尾有多少个0
//        int count0 = 0;
//        if(n/10 !=0){
//            count0 = 2*(n/10);
//            for(int i =1;i<=n%10;i++){
//                if(i==5){
//                    count0++;
//                }
//            }
//            if(n/10>=10){
//                count0 += n/100;
//            }
//        }else{
//            for(int i =1;i<=n%10;i++){
//                if(i==5){
//                    count0++;
//                }
//            }
//        }
//        System.out.println(count0);

        //3.测试通过
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count =0;
//        for(int i=n;i>=5;i--){
//            int tmp =i;
//            while(tmp%5==0){
//                count++;
//                tmp/=5;
//            }
//        }
//        System.out.println(count);


        //4.测试通过
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= 5;
        int count=0;
        while(x<n){
            count+=n/x;
            x%=5;
        }
        System.out.println(count);
    }
}
