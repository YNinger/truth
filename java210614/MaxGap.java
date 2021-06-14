package java210614;

import java.util.ArrayList;
import java.util.Collections;

public class MaxGap {
    //左右最值最大差
    public static void main(String[] args) {
        int[] arr={2,7,3,1,1};
        int n =5;
        System.out.println(findMaxGap(arr,n));
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        //输入：[2 7 3 1 1] 5
        //输出：6
        ArrayList<Integer> list = new ArrayList<>();
        for(int k=1;k<n;k++){
            int[] left = new int[k];
            int[] right = new int[n-k];
            for (int i = 0; i <k ; i++) {
                left[i] = A[i];
            }
            for (int i = k; i < n  ; i++) {
                right[i-k] = A[i];
            }
            int value = arrmax(left)-arrmax(right);
            if (value>=0) {
                list.add(value);
            }else{
                value =-value;
                list.add(value);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public static int arrmax(int[] arr){
        //计算数组的最大值
        int max = arr[0];
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
