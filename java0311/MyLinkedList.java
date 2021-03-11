package java0311;

class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }
}

//Java中一般实现的是双向链表！！！
public class MyLinkedList {
    //记录头节点位置
    private Node head;
    //记录尾节点的位置
    private Node tail;
    //记录链表元素个数
    private int length;

    public MyLinkedList(){
        head = null;
        tail = null;
    }

    public int length (){
        for(Node cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }

    //一.插入节点
    //1.头插
    public void addfirst(int val){
        //定义一个要插入的新结点
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            tail = newNode;
            length ++;
            return;
        }
        //非空链表的时候
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }

    //2.尾插
    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    //3.指定位置插入
    public void add(int index,int val){
        //先处理特殊情况
        if(index < 0||index > length){
            return;
        }
        //头插
        if(index == 0){
            addfirst(val);
        }
        //尾插
        if(index == length){
            addLast(val);
        }
        //创建一个要插入的节点
        Node newNode = new Node(val);
        //一般的情况需要找到要插入节点的位置
        Node nextNode = getNode(index);
        //此时已经获取到了要插入的后边的一个元素
        Node prevNode = nextNode.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = nextNode;
        nextNode.prev = newNode;
        length++;
    }

    //二.删除节点
    //1.删除头节点
    public void deletefirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        Node nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
        length--;
    }

    //2.删除尾节点
    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        Node prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;
        length--;
    }

    //3.删除指定节点
    public void deleteByDelete(int index){
        if(index < 0 ||index > length){
            return;
        }
        if(index == 0){
            deletefirst();
        }
        if(index == length){
            deleteLast();
        }
        Node toRemove = getNode(index);
        Node prevNode = toRemove.prev;
        Node nextNode = toRemove.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        length--;
    }


    public Node getNode(int index) {
        //获取到节点要插入的位置，根据下标节点
        if(index < 0 || index > length){
            return null;
        }
        Node cur = head;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        return cur;
    }

}
