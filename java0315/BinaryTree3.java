package java0315;

class Node{
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val='" + val + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class BinaryTree3 {
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

    //求第k层节点的个数
    //求第k层节点个数就是求第k-1层节点的叶子数
    public static int getKLevelSize(Node root,int k){
        if(root==null||k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

    //查找节点
    public static Node find(Node root,String tofind){
        if(root == null){
            return null;
        }
        if(root.val.equals(tofind)){
            return root;
        }
        Node result = find(root.left,tofind);
        //如果左子树一直没找到会返回null,然后往父节点找他的右子树
        if(result!=null){
            //这个循环条件最主要的功能就是当左子树全部遍历完之后，还未找到所要的tofind值
            //此时开始遍历父节点的右子树。
            return result;
        }
        return find(root.right,tofind);
    }

    public static void main(String[] args) {
        Node root = build();
        System.out.println(getKLevelSize(root,3));
        System.out.println(find(root,"C"));
    }
}
