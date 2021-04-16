package java210416;

import java.util.Scanner;

public class candy {
    //计算糖果
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int A = (a+c)/2;
        int B = (b+d)/2;
        int C1 = d-B;
        int C2 = d-B;
        if(A-B==a&&B-C1==b&&A+B==c&&B+C2==d&&C1==C2){
            System.out.println(A+" "+B+" "+C1);
        }else{
            System.out.println("No");
        }
        //System.out.println(A+" "+B+" "+C);
    }
}
