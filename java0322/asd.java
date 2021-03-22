package java0322;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] arr = new int[a][4];
        for (int i=0;i<a;i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
            arr[i][3] = scanner.nextInt();
        }
        long sum = 0;
        for (int i=0;i<a;i++){
            sum +=Math.abs(arr[i][2]-arr[i][0])*Math.abs(arr[i][3]-arr[i][1]);
        }
        long b =0, xMIN,yMin,xMax,yMax;
        for (int i=0;i<a;i++){
            for (int j=i+1;j<a;j++){
                xMIN = Math.max(arr[i][0],arr[j][0]);
                yMin = Math.max(arr[i][1],arr[j][1]);
                xMax = Math.min(arr[i][2],arr[j][2]);
                yMax = Math.min(arr[i][3],arr[j][3]);
                if (xMIN <xMax&&yMin<yMax){
                    b+=Math.abs(xMax- xMIN)*Math.abs(yMax-yMin);
                }else {
                    continue;
                }
            }
        }
        long c = sum-b;
        System.out.println(c);

    }
}
