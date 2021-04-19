package java210419;
import java.util.Scanner;

public class NoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int [][]arr = new int[W][H];
        int count =0;
        for(int i =0;i<W;i++){
            for(int j =0;j<H;j++){
                if(isTrue(arr,i,j)){
                    count++;
                    //将可以放蛋糕的点赋值为2，证明这边有蛋糕，进入isTrue之后就能做出判断
                    arr[i][j] = 2;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isTrue(int[][] arr, int i, int j) {
        //取到离一个点所有的距离为2的点，判断arr[i][j]与那些点的距离为2的时候，
        //则返回false，不能进入循环
        //进入循环之后，把当前的点赋值为2
        //再循环判断遍历的点他的距离为2的距离是否有蛋糕
        if(i+2<arr.length&&arr[i+2][j]==2){
            return false;
        }
        if(i-2>=0&&arr[i-2][j]==2){
            return false;
        }
        if(j+2<arr[i].length&&arr[i][j+2]==2){
            return false;
        }
        if(j-2>=0&&arr[i][j-2]==2){
            return false;
        }
        return true;
    }
}
