package java0302;

public class Avg {
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        System.out.println(avg(arr));
    }

    public static double avg(int[] arr) {
        int ret =0;
        int sum=0;
        for(int x:arr){
            //该循环依次遍历数组
            ret += x;
        }
        sum=ret/arr.length;
        return sum;
    }
}
