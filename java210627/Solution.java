package java210627;

import java.util.ArrayList;

public class Solution {
    //JZ12 数值的整数次方
    public double Power(double base, int exponent) {
        if(base==0){
            return 0;
        }
        if(exponent==0){
            return 1;
        }else if(exponent>0){
            return cal(base,exponent);
        }else{
            return 1/cal(base,-exponent);
        }
    }
    public static double cal(double base, int exponent){
        double ret = 1;
        for(int i=0;i<exponent;i++){
            ret *=base;
        }
        return ret;
    }

    //JZ13 调整数组顺序使奇数位于偶数前面
    public int[] reOrderArray (int[] array) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                list.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                list.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            array[i] = list.get(i);
        }
        return array;
    }

    //JZ14 链表中倒数最后k个结点
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int length =1;
        if(pHead==null){
            return pHead;
        }
        ListNode lengthNode = pHead;
        while(lengthNode.next!=null){
            length++;
            lengthNode = lengthNode.next;
        }
        if(length<k){
            return null;
        }
        for(int i=1;i<length-k+1;i++){
            pHead = pHead.next;
        }
        return pHead;
    }

    //JZ15 反转链表
    public ListNode ReverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode newHead = null;
        ListNode nextNode = curNode;
        if(head==null){
            return null;
        }

        while(curNode!=null){
            nextNode = curNode.next;
            if(nextNode==null){
                newHead = curNode;
            }
            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }
        return newHead;
    }

    //JZ16 合并两个排序的链表
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode fakeHead = new ListNode(0);
        ListNode head = fakeHead;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                head.next = list2;
                //head = head.next;
                list2 = list2.next;
            }else{
                head.next = list1;
                //head = head.next;
                list1 = list1.next;
            }
            head = head.next;
        }
        if(list1!=null){
            head.next = list1;
        }
        if(list2!=null){
            head.next = list2;
        }
        return fakeHead.next;
    }
}

class ListNode {
   int val;
   ListNode next = null;
   public ListNode(int val) {
     this.val = val;
   }
}
