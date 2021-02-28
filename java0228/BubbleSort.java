package java0228;

public class BubbleSort {
    //冒泡排序,给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main(String[] args) {
        int []arr={3,5,6,2,7,1,4,9,8,0};
        System.out.println("排序前");
        print(arr);
        bubblesort(arr);
        System.out.println("排序后");
        print(arr);
    }

    public static void bubblesort(int[] arr) {
        //定义为空数组或一个元素的数组
        if(arr==null||arr.length==1){
            return;
        }
        for(int i =0;i<arr.length-1;i++){
            //boolean isSorted = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    public static void print(int[] arr){
        if(arr==null){
            return;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
