package java0303;

import java.util.Scanner;

public class XGraph {
    //打印用“*”组成的X形图案
    //多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println("请输入要打印的数字2~20");
            int n = sc.nextInt();
            for(int i =1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==j||i==n-j+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
