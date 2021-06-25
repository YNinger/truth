package java210625;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private static List<Integer> list;
    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(array));;
    }
    //牛客题：JZ30 连续子数组的最大和
    // 输入一个整型数组，数组里有正数也有负数。
    // 数组中的一个或连续多个整数组成一个子数组。
    // 求所有子数组的和的最大值。
    // 要求时间复杂度为 O(n).
    //输入：
    //[1,-2,3,10,-4,7,2,-5]
    //返回值：
    //18
    //说明:输入的数组为{1,-2,3,10,—4,7,2,一5}，和最大的子数组为{3,10,一4,7,2}，因此输出为该子数组的和 18。

    //false  uncompleteable  20%
    public static int FindGreatestSumOfSubArray(int[] array) {
        int max =0;
        //如果无元素，返回0
        if(array.length==0){
            return 0;
        }
        for (int i = 0; i <array.length ; i++) {
            //calSumMax用来计算每一次遍历后的最大值
            list.add(calSumMax(i,array));
            Collections.sort(list);
            int ret =list.get(list.size()-1);
            if(ret>max){
                max = ret;
            }
        }
        return max;
    }
    public static int calSumMax(int i, int[] array) {
        boolean flag = true;
        int lineMax =0;
        for (int j = 0; j <array.length-i; j++) {
            int sum =0;
            //j是从array的第j个开始进行相加
            for (int k = 0; k <i+1 ; k++) {
                //每次进行i+1个元素进行相加
                //初始值i=0
                sum+=array[j];

                if (flag){
                    lineMax = sum;
                    flag = false;
                }
            }
            if (sum>lineMax){
                lineMax = sum;
            }
        }
        return lineMax;
    }


    //ture
    public int FindGreatestSumOfSubArray2(int[] array) {
        int max = array[0];//先让最大值等于第一个元素
        for(int i=1;i<array.length;i++){
            //让每一次的arrat[i]加上前一个数字
            //如果前一个数字>0直接相加，如果<0，加0
            //因为此时当前数组的i值已经改变成为最大值
            //如果相加的数字大于此时的max最大值，
            array[i] += array[i-1] >0 ? array[i-1]:0;
            max = Math.max(array[i],max);
        }
        return max;
    }
    public static void setList(List<Integer> list) {
        Solution.list = list;
    }
}
