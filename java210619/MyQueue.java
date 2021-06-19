package java210619;

public class MyQueue {
    static class Node{
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node head = null;
    private Node tail = null;

    //1.入队列,返回值表示插入成功或者失败
    //不含傀儡节点
    public boolean offer(int val){
        //入队列进行尾插
        Node newNode = new Node(val);
        if (head==null){
            head = newNode;
            tail = newNode;
            return true;
        }
        tail.next=newNode;
        tail = tail.next;
        //不能写成以下这样子，因为之前的tail.next不知道指向的是啥
        //必须先让尾节点的指向指向新插入的节点
        //newNode = tail.next;
        //tail = newNode;
        return true;
    }

    //2.出队列
    //进行头删操作
    public Integer pop(){
        if (head==null){
            return null;
        }
        int ret = head.val;
        if (head.next==null){

            head = null;
            return ret;
        }
        head = head.next;
        return ret;
    }
    //3.取队首元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}
