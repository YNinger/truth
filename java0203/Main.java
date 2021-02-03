package java0203;

public class Main {
    public static Node createList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    //尾部插一个节点
    public static Node insertTail(Node head,int val){
        //1.创建一个新的要插入的节点
        Node newNode = new Node(666);
        if(head==null){
            return newNode;
        }
        //2.先得找到末尾节点
        Node prev = head;
        while(prev!=null){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }

    //删除节点（按照值删除）
    public static void remove(Node head,int val){//val是要删除的值
        //先找值，以及被删除的那个节点的前一个节点
        Node prev = head;
        while(prev!=null&&prev.next!=null&&val!=prev.val){//确保被删除的不是尾节点
            prev=prev.next;
        }
        if(prev==null||prev.next==null) {
            //没有找到值为val的节点
            return;
        }
        //此时已经找到了被删除的节点的前一个结点
        //todelete指向要被删除的那个节点,也就是被删除的节点的前一个结点
        Node toDelete = prev.next;//这里先构造出被删除的那个节点toDelete
        prev.next = toDelete.next;
    }
    //删除节点（按照位置来删除）
    public static void remove(Node head,Node toDelete){
        //1.先找到要删除的前一个结点
        Node prev = head;
        while(prev!=null&&prev.next!=toDelete){
            prev = prev.next;
        }
        if(prev==null){
            //没找到
            return;
        }
        //2.进行删除
        prev.next = toDelete.next;
    }


    public static void main(String[] args) {
        Node head = createList();

        //在2和3之间插入新节点
        //1.创建一个新节点
        Node newNode= new Node(80);
        Node prev = head;
        //2.找到第二个节点
        for(int i=1;i<2;i++){
            prev=prev.next;
        }
        //3.插入结点的操作
        newNode.next = prev.next;
        prev.next = newNode;
        for(;head!=null;head=head.next){
            System.out.println(head);
        }

    }
}
