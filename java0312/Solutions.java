package java0312;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

public class Solutions {
    //1.判断是否是循环链表,是否有环
    public static boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //2.判断环的入口节点
    public static Node findentranceNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                Node cur1 = head;
                Node cur2 = fast;
                while(cur1 != cur2){
                    cur1 = cur1.next;
                    cur2 = cur2.next;
                }
                return cur1;
            }
        }
        return null;
    }
}
