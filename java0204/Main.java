package java0204;

public class Main {
    //利用数组返回一个不带傀儡节点的链表
    public static Node arrayToLinkedList(int[] array){
        //首先这个链表初始化时链表为空
        Node head = null;
        Node tail = null;
        for(int x : array){
            Node node = new Node(x);
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next=node;
                tail = tail.next;
            }
        }
        return head;
    }
    //遍历一个不带傀儡节点的链表
    public static void print(Node head) {
        for(Node cur=head ; cur!=null ; cur=cur.next){
            System.out.println(cur.val);
        }
    }
    //遍历一个带傀儡节点的链表
    public static  void dummyprint(Node head){
        for(Node cur= head.next ; cur!=null ; cur=cur.next){
            System.out.println(cur.next);
        }
    }


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        Node head = arrayToLinkedList(arr);
        print(head);
    }


}
