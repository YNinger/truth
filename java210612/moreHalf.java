package java210612;

import java.util.Arrays;

public class moreHalf {
    //数组中出现次数超过一半的数字
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[(array.length)/2]==array[i]){
                count++;
            }
        }
        if (count> ((array.length)/2)){
            return array[(array.length)/2];
        }
        return 0;
    }
}
