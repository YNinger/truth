package java210804;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        int n =length1>length2?(length1-length2):(length2-length1);
        if (length1>length2){
            while (n>0){
                cur1 = cur1.next;
                n--;
            }
        }else{
            while(n>0){
                cur2 = cur2.next;
                n--;
            }
        }
        while (cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    private int getLength(ListNode pHead) {
        int length =0;
        for (ListNode node = pHead;node!=null;node=node.next){
            length++;
        }
        return length;
    }


    public static int[] FindNumsAppearOnce (int[] array) {
        // write code here
        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<>();
        if (array[0]!=array[1]){
            list.add(array[0]);
        }
        for (int i = 1; i <array.length-1; i++) {
            if (array[i]!=array[i-1]&&array[i]!=array[i+1]){
                list.add(array[i]);
            }
        }
        if (array[array.length-1]!=array[array.length-2]){
            list.add(array[array.length-1]);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            arr[i] =  list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array ={1,4,1,6};
        int[] newarr=FindNumsAppearOnce(array);
        for (int value : newarr) {
            System.out.print(value+" ");
        }
    }
}
