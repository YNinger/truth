package java0323;

public class mySort {
    //1.直接插入排序
    public static void insertSort(int[] arr) {
        int bound = 1;
        for(;bound<=arr.length;bound++){
            int v = arr[bound];
            int cur = bound-1;
            for(;cur>=0;cur--){
                if(arr[cur]>v){
                    arr[cur+1] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1] = v;
        }
    }

    // 谢尔/希尔
    public static void shellSort(int[] arr) {
        // 指定 gap 序列, len/2, len/4, len/8,...,1
        int gap = arr.length / 2;
        while (gap >= 1) {
            _shellSort(arr, gap);
            gap = gap / 2;
        }
    }

    public static void _shellSort(int[] arr, int gap) {
        // 进行分组插排. 分组依据就是 gap.
        // gap 同时也表示分的组数.
        // 同组的相邻元素, 下标差值就是 gap
        // 下面的代码其实和插入排序是一样的. 尤其是把 gap 设为 1
        int bound = gap;
        for (; bound < arr.length; bound++) {
            int v = arr[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap) {
                if (arr[cur] > v) {
                    // 进行搬运
                    arr[cur + gap] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }

    public static void swap(int[] arr,int x,int y){
        int tmp = x;
        arr[x] = arr[y];
        arr[y] = arr[tmp];
    }


    //冒泡
    public static void bubbleSort(int[] arr){
        for(int bound = 0;bound<arr.length;bound++){
            for(int cur =arr.length-1;cur>bound;cur--){
                if (arr[cur-1]>arr[cur]) {
                    swap(arr,cur-1,cur);
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[]arr){
        //创建一个变量来分割已排区间和待排区间
        int bound = 0;
        for(;bound<arr.length;bound++){
            for(int cur = bound+1;cur<arr.length;cur++){
                if(arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }

    //堆排序？？？
    public static void heapSort(int[] arr){
        //堆排序
        //先建立堆
    }


    //快速排序？？？
    public static void quickSort(int[]arr){
        //创建一个递归使用方法，明确指定在哪个区间进行递归
        _quickSort(arr,0,arr.length-1)
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if(left>=right){
            //说明该区间只有一个或没有元素
            return;
        }

    }
}
