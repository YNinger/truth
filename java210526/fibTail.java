package java210526;

import java.util.Scanner;

public class fibTail {
    //先计算斐波那契数放到一个数组中存起来
    //如果不到六位，也就是该数<100000,直接取出
    //如果取出的那个斐波那契数大于等于100000，只需要取得后边六位即可
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fib = new int[100001];
        fib[0] =1;
        fib[1] =1;
        for(int i =2;i<fib.length;i++){
            fib[i] = (fib[i-1]+fib[i-2])%1000000;
        }
        while (sc.hasNext()){
            int n =sc.nextInt();

            if(n<=29){
                System.out.println(fib[n]);
            }else{
                //补全倒数第六个数为零的情况
                //63821--》063821
                System.out.printf("%06d\n",fib[n]);
            }
        }
    }
}
