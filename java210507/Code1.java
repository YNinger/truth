package java210507;

import java.util.Scanner;

public class Code1 {
    //iNOC产品部-杨辉三角的变形
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printrow(n);
//    }
//
//    public static void printrow(int n) {
//        for (int i =0;i<n;i++){
//            printline(i,n);
//        }
//    }
//
//    public static void printline(int i, int n) {
//        for(int j =0;j<2*i+1;j++){
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int [][]arr = new int[n][2*n-1];
            //先将杨辉三角补成矩形，且均为0
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    arr[i][j]=0;
                }
            }
            //先赋值，将第一行中间的一个元素赋值为1
            //再对第n行得最左最右两个元素赋值为1
            arr[0][n-1] = 1;
            arr[n-1][0] =1;
            arr[n-1][2*n-2]=1;
            //对元素的每一个值进行赋值
            for(int i = 1;i<n;i++){
                for(int j = 1;j<2*n-2;j++){
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1];
                }
            }
            //判断第n行的偶数在某个位置
            for(int i =0;i<2*n-1;i++){
                if(arr[n-1][i]%2==0&&arr[n-1][i]!=0){
                    System.out.println(i+1);
                    break;
                }else if(i==2*n-2) {//??????????判断条件
                    System.out.println(-1);
                }
            }
        }
    }
}
