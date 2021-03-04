package java0304;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
//task 1
//给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。

class Soulution {
    public int GetLength(ListNode head){
        //1.先遍历得到链表长度lenth
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }

    public ListNode middleNode(ListNode head){
        //3.最后循环到达并找到中间元素
        if(head==null){
            return null;
        }
        //求出链表长度
        int length = GetLength(head);
        //2.再通过lenth/2得到中间元素位置
        int steps = length/2;
        ListNode cur = head;
        for(int i =0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }

    //task 2
//实现链表题目: 获取链表倒数第K个节点
    class Solutions {
        public ListNode FindKthToTail(ListNode head, int k) {
            int lenth = GetLength(head);
            if(head==null||k<0||k>lenth){
                return null;
            }
            int steps = lenth-k;
            ListNode cur=head;
            for(int i =0;i<steps;i++){
                cur=cur.next;
            }
            return cur;
        }
    }
}


