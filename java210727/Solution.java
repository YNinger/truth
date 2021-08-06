package java210727;

import java.util.ArrayList;

public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int length = pushA.length;
        ArrayList list = new ArrayList();
        for (int i=0;i<pushA.length;i++){
            list.add(pushA[length-i-1]);
        }
        for (int i=0;i<length;i++){
            if (!list.get(i).equals(popA[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
}
