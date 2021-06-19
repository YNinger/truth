package java210619;

class Node{
    Node next;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

public class MyStack2 {
    private Node head =null;

    //1.入栈
    public void push(int val){
        //不带傀儡节点
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //2.出栈
    public Integer pop(){
        //头删
        if (head==null) {
            //为空
            return null;
        }
        if (head.next==null){
            //只有一个节点
            int ret = head.val;
            head=null;
            return ret;
        }
        int ret = head.val;
        head = head.next;
        return ret;
    }
    //查看栈顶元素
    public Integer peek(){
        if (head==null){
            return null;
        }
        return head.val;
    }
}
