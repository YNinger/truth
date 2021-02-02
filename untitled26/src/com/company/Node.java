package com.company;
//已知一条链表，不知道其长度的情况下：
//通过遍历，打印链表的每个元素。
//通过遍历，找到链表的最后一个结点。
//通过遍历，找到链表的倒数第二个结点。
//通过遍历，找到链表的第 n 个结点。（链表的长度 >= n)
//通过遍历，计算链表中元素的个数。
//通过遍历，找到链表中是否包含某个元素。
public class Node {
    public int val;
    public Node next;

    public Node(int val){
        this.val=val;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" + val +"}";
    }
}
