package java0204;

public class Node {
    public Node next;
    public int val;
    public Node(int val){
        this.val=val;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + '}';
    }
}
