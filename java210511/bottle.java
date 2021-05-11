package java210511;

import java.util.Scanner;

public class bottle {
    // 汽水瓶
    // 有这样一道智力题:“某商店规定:三个空汽水瓶可以换一瓶汽水。
    // 小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝?”
    // 答案是5瓶，方法如下:先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
    // 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
    // 然后你让老板先借给你─瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
    // 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        int[] num = new int[10];
        while(n<10){
            num[n] = sc.nextInt();
            if(num[n]==0){
                break;
            }
            n++;
        }
        for(int i =0;i<n;i++){
            System.out.println(count(num[i]));
        }
    }

    public static int count(int n) {
        if(n==0||n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return n/2;
    }
}
