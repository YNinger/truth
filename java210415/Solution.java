package java210415;

import java.util.Scanner;

public class Solution {
    //数组中出现次数超过一半的数字
    public static int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int getnumcount = 0;
        int repetitivenum = 0;
        int halflength = array.length/2;
        for (int i =0;i<array.length;i++){
            repetitivenum = array[i];
            for(int j =0; j<array.length;j++){
                if(repetitivenum == array[j]){
                    count++;
                }
            }
            if (count>halflength ){
                return repetitivenum;
            }else{
                count =0;
            }//12222533
        }
        return 0;
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,2,3,4,2,2,5,2};
        int a = MoreThanHalfNum_Solution(arr);
        System.out.println(a);
    }
}
