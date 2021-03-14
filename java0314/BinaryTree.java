package java0314;

class p{
    public final static double i = 3.1212;
}

class Node{
    String val;
    Node left;
    Node right;

    double i =3.14;
    public Node(String val, double i) {
        this.val = val;
        this.i = i;
    }

    public Node(String val) {
        this.val = val;

    }
}


public class BinaryTree {
    public static Node build(){

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
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
        //这个判断条件一直到最后一个叶子节点的时候才返回上一个方法
        if(root == null){
            return;
        }
        //先输出节点的值
        System.out.print(root.val);
        //再遍历左子树，一直遍历到最左边的节点时才返回
        preOrder(root.left);
        //再遍历右子树
        preOrder(root.right);
    }

    //中序遍历
    //先对左子树遍历，然后输出该节点的值，再遍历右子树
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        //先遍历左子树
        inOrder(root.left);
        //输出节点的值
        //先输出左子树的值，然后再依次往上输出父节点的值，在进入到右子树中去
        System.out.print(root.val);
        //遍历右子树
        inOrder(root.right);
    }

    //后序遍历
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        //先遍历左子树
        postOrder(root.left);
        //再遍历右子树
        postOrder(root.right);
        //先当左右子树都为空的时候才能输出打印节点的值
        //只有先遍历完一个父节点的左右子树之后才能打印根节点
        System.out.print(root.val);
    }

    //计算节点的个数
    //1.用count的方式进行计算
    public static int count = 0;
    public static int length(Node root){
        if(root == null){
            return 0 ;
        }
        count++;
        length(root.left);
        length(root.right);
        return count;
    }
    //2.用返回值计算
    public static int length2(Node root){
        if(root == null){
            return 0;
        }
        return 1+length2(root.left)+length2(root.right);
    }

    //判断叶子节点的个数
    //方法1
    //思路：遍历二叉树，当碰见左右子树都为null的时候size++
    public static int size = 0;
    public static int GetLeafsize(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null&&root.right == null){
            size++;
        }
        GetLeafsize(root.left);
        GetLeafsize(root.right);
        return size;
    }

    //方法2
    //用返回值的方式
    public static int GetLeafsize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null&&root.right==null){
            return 1;
        }
        return GetLeafsize2(root.left) + GetLeafsize2(root.right);
    }



    public static void main(String[] args) {
        Node root = build();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        System.out.println(length(root));;
//        System.out.println(length2(root));
//        System.out.println(GetLeafsize(root));
//        System.out.println(GetLeafsize2(root));
    }
}
