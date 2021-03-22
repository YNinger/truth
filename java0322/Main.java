package java0322;

import java.util.Scanner;

public class Main {
//    public static final int N=5^5+88;
//    private static final int P = 10^9+7;
    public static void main(String[] args) {
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int[][]arr = new int[n][m];
//        for(int i= 0;i<n;i++){
//            for(int j = 0;j<m;j++){
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
////        for(int i =0;i<arr.length;i++){
////            for(int j=0;j<arr[i].length;j++){
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
//        int count = 0;
//        for(int i =0;i<n;i++){
//            for(int j =0;j<arr[i].length;j++){
//                int[] arr1 =new int[arr[i].length];
//                arr1[j] = arr[i][j];
//            }
//        }
//        System.out.println(count);

//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        int N=sc.nextInt();
//        int Ti[]=new int[N];
//        int V[]=new int[N];
//        for(int i=0;i<N;i++) {
//            Ti[i]=sc.nextInt();
//            V[i]=sc.nextInt();
//        }
//        int arr[][]=new int[N+1][T+1];
//        for(int x=1;x<=N;x++) {
//            for(int y=1;y<=T;y++) {
//                if(Ti[x-1]<=y){
//                    arr[x][y]=Math.max(arr[x-1][y],arr[x-1][y-Ti[x-1]]+V[x-1]);
//                } else{
//                    arr[x][y]=arr[x-1][y];
//                }
//            }
//        }
//        System.out.println("Case"+" "+arr[N][T]);
//


//
//        //int ans,C[N],a[N];
//        int ans = 0;
//        int []arr1 = new int[N];//c
//        int []arr2 = new int[N];//a
//
//            Scanner scanner = new Scanner(System.in);
//            int j = scanner.nextInt();
//            int k = scanner.nextInt();
//        arr1[1]=arr1[2]=1;
//            for(int i=3;i<=j;++i)
//                arr1[i]=((i-1)*arr1[i-1]%P+(i-2)*arr1[i-2]%P)%P;
//        arr2[0]=1;
//            for(int i=1;i<j;++i)
//                arr2[i]=arr2[i-1]*(j-i)%P*ksm(i,P-2)%P;
//            for(int i=0;i<=k;++i)
//                ans=(ans+arr2[i]*arr1[j-i]%P)%P;
//        System.out.println(ans);
//
//    }
//
//    public static int ksm(int i, int i1) {
//        int ans=1;
//        for(;i1==0;i1>>=1,i=i*i%P)
//        if(i1==1)
//            ans=ans*i%P;
//        return ans;

//        int N = scanner.nextInt();
//        for(;N>0;N--){
//            int i = scanner.nextInt();
//            int j = scanner.nextInt();
//        }
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
            long b =0,xMin,yMin,xMax,yMax;
            for (int i=0;i<a;i++){
                for (int j=i+1;j<a;j++){
                    xMin = Math.max(arr[i][0],arr[j][0]);
                    yMin = Math.max(arr[i][1],arr[j][1]);
                    xMax = Math.min(arr[i][2],arr[j][2]);
                    yMax = Math.min(arr[i][3],arr[j][3]);
                    if (xMin<xMax&&yMin<yMax){
                        b+=Math.abs(xMax-xMin)*Math.abs(yMax-yMin);
                    }else {
                        continue;
                    }
                }
            }
            long c = sum-b;
            System.out.println(c);
    }
}
