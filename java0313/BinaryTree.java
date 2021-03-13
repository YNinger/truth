package java0313;

class Node{
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}

public class BinaryTree {

    public static Node build(){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("c");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    //先序遍历
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        //先访问根节点
        System.out.print(root.val);
        //遍历左子树
        preOrder(root.left);
        //遍历右子树
        preOrder(root.right);
    }

    //中序遍历
    public static void inPrder(Node root){
        if(root == null){
            return;
        }
        //先遍历左子树
        inPrder(root.left);
        //访问节点
        System.out.print(root.val);
        //访问右子树
        inPrder(root.right);
    }

    public static void main(String[] args) {
        Node root = build();
        preOrder(root);
        inPrder(root);

    }
}
