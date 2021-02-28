package java0228;

public class BinarySearch {
//    给定一个有序整型数组, 实现二分查找
public static void main(String[] args) {
    int []arr ={1,3,4,5,6,8,9,22,44};
    int ret = binarySearch(arr,22);
    System.out.println("已找到"+arr[ret]+"下标为："+ret);
}
    public static int binarySearch(int[] arr, int tofind) {
    int left =0;
    int right = arr.length;
    while(left<right){
        int mid = (left+right)/2;
        if(tofind<arr[mid]){
            right = mid-1;
        }
        else if(tofind>arr[mid]){
            left = mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
    }
}
