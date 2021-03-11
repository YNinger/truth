package java0311;

import org.w3c.dom.NodeList;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static ListNode reservalList(ListNode head){
        if(head == null||head.next==null){
            return head;
        }

        ListNode curNode = head;
        ListNode prevNode = null;
        ListNode newhead = null;
        while(curNode!=null){
            ListNode nextNode = curNode.next;
            if(nextNode==null){
                newhead = curNode;
            }
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        return newhead;
    }

    public static ListNode mergeTwoList(ListNode head1,ListNode head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        while(cur1!=null&&cur2!=null){
         if(cur1.val<cur2.val){
             newTail.next = cur1;
             cur1 = cur1.next;
         }else{
             newTail.next = cur2;
             cur2 = cur2.next;
         }
         newTail = newTail.next;
        }
        if(cur1==null){
            newTail.next = cur2;
        }else {
            newTail.next = cur1;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = createlist();
        print(head);
        ListNode head1 = reservalList(head);
        print(head1);
    }

    public static void print(ListNode head1) {
        for(ListNode cur = head1;cur!= null;cur = cur.next){
            System.out.print(cur.val+" ");
        }
        System.out.println();
    }

    public static ListNode createlist() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }
}
