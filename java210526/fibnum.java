package java210526;

import java.util.Scanner;

public class fibnum {
    public static void main(String[] args) {
        int[] fib = new int[100];
        fib[0] =1;
        fib[1] =1;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i =2;i<fib.length;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        while (sc.hasNext()) {
            int n =sc.nextInt();
            System.out.println(fib[n]);
        }
//        for(int i =0;i<fib.length;i++){
//            if(fib[i]<100000){
//                count++;
//            }else{
//                System.out.println(count);
//                break;
//            }
//        }
    }
}
