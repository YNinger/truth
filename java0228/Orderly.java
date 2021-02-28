package java0228;

import java.util.Arrays;

public class Orderly {
    //给定一个整型数组, 判定数组是否有序(递增)

    public static void main(String[] args) {
        int []arr={3,5,2,6,8,31,9};
        isSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
