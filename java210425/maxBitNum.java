package java210425;

import java.util.Scanner;

public class maxBitNum {
    //求最大连续bit数
    //将一个输入的十进制数转化成二进制数，算最长连续的1的个数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            System.out.println(seqByte(num));
        }
        sc.close();
    }
    public static int seqByte(int n) {
        //方法二
        int k;
        for (k = 0; n != 0; k++) {
            n = n & (n << 1);
        }
        return k;
    }
}
