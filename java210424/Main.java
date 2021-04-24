package java210424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
////        System.out.println("To iterate is human, to recurse divine.");

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        int M = sc.nextInt();
//        System.out.println(N-K*M);

//        //先计算输入数字的个数
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret =n;
//        int count =1;
//        while(ret/10!=0){
//            count++;
//            ret/=10;
//        }
//        //System.out.println(count);
//        if(count==6){
//            if (n % 100 < 10) {
//                System.out.println(n/100+"-0"+n%10);
//            }else{
//                System.out.println(n/100+"-"+n%100);
//            }
//        }
//        if(count==4){
//            if(n/100<22){
//                if (n%100<10){
//                    System.out.println("20"+n/100+"-0"+n%100);
//                }else{
//                    System.out.println("20"+n/100+"-"+n%100);
//                }
//            }else {
//                if(n%100<10){
//                    System.out.println("19"+n/100+"-0"+n%100);
//                }else{
//                    System.out.println("19"+n/100+"-"+n%100);
//                }
//            }
//        }

        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        int ccount =count;
//        int hopeprice = sc.nextInt();
//        float nowprice =0;
//        float[] arr = new float[count];
//        while (ccount!=0) {
//            nowprice = sc.nextFloat();
//            arr[count-ccount]=nowprice;
//            ccount--;
//        }
//        for(int i =0;i<count;i++){
//            if(arr[i]<hopeprice){
//                System.out.println("On Sale! "+arr[i]);
//            }
//        }


        //成功
//        int[] emjoy = new int[24];
//        for (int i =0;i<24;i++) {
//            emjoy[i] = sc.nextInt();
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        while(true){
//            int time = sc.nextInt();
//            if(time>23||time<0){
//                break;
//            }
//            list.add(time);
//        }
//        for(int i =0;i<list.size();i++){
//            if(emjoy[list.get(i)]>50){
//                System.out.println(emjoy[list.get(i)]+" Yes");
//            }else{
//                System.out.println(emjoy[list.get(i)]+" No");
//            }
//        }

//        //几道题
//        int n = sc.nextInt();
//        //做了几道题
//        int m = sc.nextInt();
//        ArrayList<String> st = new ArrayList<>();
//        while(n!=0){
//            String problem = sc.nextLine();
//            st.add(problem);
//        }
//        while(n-m)

//        int num = sc.nextInt();
//        int []arr = new int[num];
//        if(num==0){
//            return;
//        }
//        for(int i=0;i<10;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int countmin = 1;
//        int countmax = 1;
//
//        for(int i =0;i<num;i++){
//            if(i+1>=num){
//                break;
//            }
//            if(arr[i]==arr[i+1]){
//                countmin++;
//            }else {
//                break;
//            }
//        }
//        for(int i =num-1;i>=0;i--){
//            if(i-1<0){
//                break;
//            }
//            if(arr[i]==arr[i-1]){
//                countmax++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(arr[0]+" "+countmin);
//        System.out.println(arr[num-1]+" "+countmax);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int[]arr = new int[n];
        for (int i=0;i<n;i++){
            //判断条件

            arr[0] = a;
            arr[1] = b;
            int c = arr[count]*arr[count+1];
            if(c<10){
                arr[i+2] = c;
            }else if (c==10){
                arr[i+2] = 1;
                if(count==n||i+3>=n){
                    break;
                }
                arr[i+3] =0;
                i++;
            } else {
                arr[i+2] = c/10;
                if(count==n||i+3>=n){
                    break;
                }
                arr[i+3] = c%10;
                i++;
            }
            count++;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
            if(i==n-1){
                break;
            }
            System.out.print(" ");
        }
    }
}
