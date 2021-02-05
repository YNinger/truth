package java0205;


 class ListNode{
    ListNode next =null;
    int val = 0;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }
}
public class Solution {
//1263456
    public static ListNode createNode(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        return a;
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode prevNode = head;
        ListNode curNode = prevNode.next;
        for(;curNode!=null;){
            if(curNode.val==val){
                //找到节点，删除节点
                prevNode.next = curNode.next;
                curNode =  prevNode.next;
            }else{
                //更新prevNode和curNode的指向
                prevNode = curNode;
                curNode = curNode.next;
            }
        }

        //判断头节点和更新后的链表其
        if(head.val==val){
            head = head.next;
        }
        return head;
    }

    public static void print(ListNode cur){
        for(;cur!=null;cur=cur.next){
            System.out.print(cur.val);
        }
    }
    public static void main(String[] args) {

        ListNode head = createNode();
        ListNode result = removeElements(head,6);
        print(result);
    }
}
