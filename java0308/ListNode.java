package java0308;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solutions{
    //1.合并两个链表(按照大小顺序)
    //思路：先判断是否是空链表，再构建一个带傀儡节点的新链表，具有newhead和newtail
    //分别比较所给的两个链表每个val值的大小，小的插入新的链表，并更新newtail,重复交替进行
    //一方的链表先为空，则将另一个链表的所有元素插入到新链表，最后返回傀儡节点的next
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //判断是否为空，一方为空，则输出为另一方
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        //用个新的值代表原链表，防止修改它
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode newhead = new ListNode(0);
        ListNode newtail = newhead;
        //两个链表都不为空，进入循环，直至有一方为空跳出循环
        while(cur1 != null && cur2 !=null){
            if(cur1.val<cur2.val){
                newtail.next = cur1;
                cur1 = cur1.next;
            }else {
                newtail.next = cur2;
                cur2 = cur2.next;
            }
            newtail = newtail.next;
        }
        //当有一个链表为空时，跳出循环，判断哪个为空
        if(cur1==null){
            newtail.next = cur2;
        }else {
            newtail.next = cur1;
        }
        return newhead.next;
    }

    //2.实现链表题目: 给定 x, 把一个链表整理成前半部分小于 x, 后半部分大于等于 x 的形式
    //设计思路：构建两个新链表，将小于x的放在一起，将大于等于x的放在一起，最后将两个链表合并
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }

        ListNode cur = pHead;

        ListNode newhead1 = new ListNode(0);
        ListNode newtail1 = newhead1;

        ListNode newhead2 = new ListNode(0);
        ListNode newtail2 = newhead2;

        while(cur!=null){
            if(cur.val < x){
                newtail1.next = new ListNode(cur.val);//创建新节点
                newtail1 = newtail1.next;
            }else {
                newtail2.next = new ListNode(cur.val);
                newtail2 = newtail2.next;
            }
            cur = cur.next;
        }
        newtail1.next = newhead2.next;
        return newhead1.next;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    //例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {

    }
}
