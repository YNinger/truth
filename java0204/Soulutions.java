package java0204;


class ListNode{
    int val = 0;
    ListNode next = null;
    public ListNode(){
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
public class Soulutions {
    public static ListNode createList(){
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
    public static ListNode reserveList(ListNode head){
        //反转链表
        if(head==null){
            //空链表
            return null;
        }
        if(head.next==null){
            //只有一个节点且为头节点
            return head;
        }
        ListNode newhead = null;
        ListNode prevNode = null;
        ListNode curNode = head;
        ListNode nextNode = curNode.next;
        while(curNode!=null){
            nextNode = curNode.next;
            if(nextNode==null){
               newhead = curNode;
            }
            curNode.next = prevNode;//链表逆序
            prevNode = curNode;
            curNode = nextNode;

        }
        return newhead;
    }
    public static void print(ListNode head){
        for(ListNode cur = head;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }

    public static void main(String[] args) {
        ListNode head = createList();
        //print(head);
        ListNode newed1 = reserveList(head);
        print(newed1);
    }
}
