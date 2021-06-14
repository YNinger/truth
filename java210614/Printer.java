package java210614;

public class Printer {
    //顺时针打印矩形
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] arr = new int[m*n];
        int k =0;
        int low = 0;
        int high = mat.length-1;
        int left = 0;
        int right =mat[0].length-1;
        while(low<=high&&left<=right){
            //向右遍历
            for (int i =left ; i <=right ; i++) {
                arr[k] = mat[low][i];
                k++;
            }
            //向下遍历
            for (int i = low+1; i <=high ; i++) {
                arr[k] = mat[i][right];
                k++;
            }
            //向左遍历
            if (low<high) {
                for (int i = right-1; i >=left ; i--) {
                    arr[k] = mat[high][i];
                    k++;
                }
            }
            //向上遍历
            if (left<right){
                for (int i = high-1; i >low ; i--) {
                    arr[k] = mat[i][left];
                }
            }
            low++;
            high--;
            left++;
            right--;
        }
        return arr;
    }
}
