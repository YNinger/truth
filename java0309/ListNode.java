package java0309;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solutions{

    public int getlenth(ListNode head){
        int len = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }


    //1.在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    //例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {
        //思路：建立一个新的链表(带有傀儡节点)，newHead和newTail
        //建立循环，判断每一次那些元素进行循环，继而跳过该元素，随后去到不是重复的元素插入到新的链表里边
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }

        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        ListNode cur = pHead;

        //此链表的元素至少有两个
        while(cur != null){
            //这段代码深刻理解
            if(cur.next != null && cur.val == cur.next.val){
                //当链表最后几个元素都相同时，要将最后一个都丢弃
                while(cur.next!=null && cur.val == cur.next.val)
                cur = cur.next;
            }else{
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }

    //2.实现链表题目: 判定链表是否是回文
    public boolean chkPalindrome(ListNode A) {
        //回文：12321；12233221
        //思路：先将原来的链表复制一份，再将复制的链表逆序，最后将逆序后的链表与原链表相比较是否一样
        //1.判断链表是否为空
        if(A == null){
            return true;
        }
        if(A.next == null){
            return true;
        }
        //2.复制链表
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        for(ListNode cur = A;cur != null;cur = cur.next){
            newTail.next = new ListNode(cur.val);
            newTail = newTail.next;
        }
        ListNode B = newHead.next;
        //3.逆置链表
        ListNode prveNode = null;
        ListNode curNode = B;

        while(curNode != null){
            ListNode nextNode = curNode.next;
            if(nextNode == null){
                B = curNode;
            }
            curNode.next = prveNode;
            prveNode = curNode;
            curNode = nextNode;
        }
        //4.比较两个新链表是否相同
        ListNode l1 = A;
        ListNode l2 = B;

        while(l1!=null && l2!= null){
            if(l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    //3。实现链表题目: 判定链表相交
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //思路：1.先遍历两个链表，取得len1和len2
        //2.让较长的链表先向后移动len1-len2个长度
        //3.两个链表同时走，直到相交的时候
        int len1 = getlenth(headA);
        int len2 = getlenth(headB);

        if(len1>len2){
            for(int i =0;i<(len1-len2);i++){
                headA = headA.next;
            }
        }else{
            for(int i =0;i<(len1-len2);i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB!=null){
            //循环条件不是判断节点的值而是节点对象的身份
            //所以要一直循环下去，直到找到两个链表的交点
            //如果到最后链表为空的时候跳出循环，则说明两个链表不相交
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
