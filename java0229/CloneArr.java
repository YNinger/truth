package java0229;

public class CloneArr {
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newarr = clonearr(arr);
        print(arr);
        print(newarr);
    }

    public static int[] clonearr(int[] arr) {
        int[] ret = new int[arr.length];//新建一个数组名为ret数组，数组赋值大小为arr.length
        for (int i=0;i<arr.length;i++){
            ret[i]=arr[i];
        }
        return ret;
    }

    public static void print(int[]arr){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
