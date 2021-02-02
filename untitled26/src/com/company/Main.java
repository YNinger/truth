package com.company;

public class Main {
    //通过该方法创造出一份固定内容的链表
    //用头节点代表整个链表
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
    public static void main(String[] args) {
	// write your code here
        Node head = createList();//接收传过来的a得首地址
        Node cur = head;
//        //1.打印链表的每个元素
//        while(cur!=null){
//            System.out.println(cur.val);
//            cur=cur.next;
//        }

//        //2.找到链表最后一个节点
//        while(cur!=null){
//            cur=cur.next;
//        }
//        System.out.println("找到了最后一个节点");


//        //3.通过遍历，找到链表的倒数第二个节点
//        while(cur!=null&&cur.next!=null&&cur.next.next!=null){
//            cur=cur.next;
//        }
//        System.out.println("知道了倒数第二个节点"+cur);

//        //4通过遍历，找到链表的第n个节点
//        int n = 4;
//        for(int i =1;i<n;i++){//i不能等于n,因为i=1的时候就是第一个节点，不需要进入循环
//            cur=cur.next;
//        }
//        System.out.println(cur);

//        //5.通过遍历，计算链表中元素的个数
//        int count=0;
//        for(;cur!=null;cur=cur.next){
//            count++;
//        }
//        System.out.println(count);

//        //6.通过遍历，找到链表中是否包含某个元素
//        int found=3;
//        for(;cur!=null;cur=cur.next){
//            if(cur.val==found){
//                break;
//            }
//        }
//        if(cur!=null){
//            System.out.println("找到了节点"+cur);
//        }
//        else{
//            System.out.println("没找到");
//        }

        //7.通过遍历，找到链表中的倒数第n个节点
        int n =4;
        int size = 0;

        for(Node calcur=head;calcur!=null;calcur=calcur.next){
            size++;
        }
        for(int i=1;i<size+1-n;i++){
            cur=cur.next;
        }
        System.out.println("倒数第"+n+"个节点为"+cur);
    }
}
